/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nlpcraft.model.tools.test;

import org.apache.nlpcraft.model.*;
import org.apache.nlpcraft.model.tools.test.impl.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Data model auto-validator is based on {@link NCIntentSample} and {@link NCIntentSampleRef} annotations. Validation
 * consists of starting an embedded probe, scanning all deployed models for these annotations and their
 * corresponding callback methods, submitting each sample input sentences from the annotation and checking that
 * resulting intent matches the intent the sample was attached to.
 * <p>
 * Note that there can be more than one {@link NCIntentSample} or {@link NCIntentSampleRef} annotation attached to
 * the intent callback. Each such  annotation will trigger conversation STM reset before its samples will be submitted.
 * This gives an opportunity to test samples both with and without conversational context as well as the same
 * sample but with multiple different conversation contexts.
 * <p>
 * This class can be used in two modes:
 * <ul>
 *     <li>
 *         As a standalone application. See {@link #main(String[])} method for details. 
 *         In this mode it can be used to automatically test models from IDE, maven builds, etc. without
 *         creating a separate, dedicated unit test for it.
 *     </li>
 *     <li>
 *         As a utility class that can be called programmatically from other classes, e.g. unit tests. See
 *         {@link #isValid()} and {@link #isValid(Class)} methods for more details.
 *     </li>
 * </ul>
 * <p>
 * See <a target=_ href="https://nlpcraft.apache.org/examples/alarm_clock.html">Alarm Clock</a>,
 * <a target=_ href="https://nlpcraft.apache.org/examples/light_switch.html">Light Switch</a>, and
 * <a target=_ href="https://nlpcraft.apache.org/examples/weather_bot.html">Weather Bot</a> examples
 * for usage of model auto-validator.
 * 
 * @see NCIntentSample
 * @see NCIntentSampleRef
 * @see NCIntent
 * @see NCIntentRef
 */
public class NCTestAutoModelValidator {
    /**
     * System property name for the optional comma-separate list of class names for the models to test.
     * If not provided, the models from the probe configuration will be used.
     */
    public final static String PROP_MODELS = "NLPCRAFT_TEST_MODELS";

    /**
     * System property name for the optional path to probe configuration file. If not provided,
     * the default probe configuration file will be used.
     */
    public final static String PROP_PROBE_CFG = "NLPCRAFT_PROBE_CONFIG";

    /**
     * System property name for the optional comma separated list of intent IDs to test.
     * If not provided, all detected intents will be tested.
     */
    public final static String PROP_INTENT_IDS = "NLPCRAFT_TEST_INTENT_IDS";

    /**
     * Performs validation based on {@link NCIntentSample} and {@link NCIntentSampleRef} annotations.
     * <p>
     * This is an entry point for a standalone application that expects three system properties (all optional):
     * <ul>
     *     <li>
     *         <code>NLPCRAFT_TEST_MODELS</code> - optional comma separated list of fully qualified data model class names to
     *         test. Validator will start the embedded probe with these models as an override for
     *         <code>'nlpcraft.probe.models'</code> configuration value. If not provided - the models defined in configuration (default or
     *         provided via <code>NLPCRAFT_PROBE_CONFIG</code> property) will be used.
     *     </li>
     *     <li>
     *         <code>NLPCRAFT_PROBE_CONFIG</code> - optional path to probe configuration file. If not provided -
     *         the default NLPCraft configuration will be used.
     *     </li>
     *     <li>
     *         <code>NLPCRAFT_TEST_INTENT_IDS</code> - optional comma separated list of intent IDs to test. If
     *         not provided, all detected intents will be tested.
     *     </li>
     * </ul>
     * Note that standard validation output will be printed out to the configured logger (e.g. log4j), if any.
     * 
     * @param args These arguments are ignored.
     */
    public static void main(String[] args) {
        System.exit(NCTestAutoModelValidatorImpl.isValid() ? 0 : 1);
    }

    /**
     * Performs validation based on {@link NCIntentSample} and {@link NCIntentSampleRef} annotations.
     * <p>
     * This method expects three system properties (all optional):
     * <ul>
     *     <li>
     *         <code>NLPCRAFT_TEST_MODELS</code> - optional comma separated list of fully qualified data model class names to
     *         test. Validator will start the embedded probe with these models as an override for
     *         <code>'nlpcraft.probe.models'</code> configuration value. If not provided - the models defined in configuration (default or
     *         provided via <code>NLPCRAFT_PROBE_CONFIG</code> property) will be used.
     *     </li>
     *     <li>
     *         <code>NLPCRAFT_PROBE_CONFIG</code> - optional path to probe configuration file. If not provided -
     *         the default NLPCraft configuration will be used.
     *     </li>
     *     <li>
     *         <code>NLPCRAFT_TEST_INTENT_IDS</code> - optional comma separated list of intent IDs to test. If
     *         not provided, all detected intents will be tested.
     *     </li>
     * </ul>
     * Note that standard validation output will be printed out to the configured logger (e.g. log4j), if any.
     * 
     * @return <code>True</code> if no validation errors found, <code>false</code> otherwise. Note that
     *      standard validation output will be printed out to the configured logger (e.g. log4j), if any.
     */
    public static boolean isValid() {
        return NCTestAutoModelValidatorImpl.isValid();
    }

    /**
     * Performs validation based on {@link NCIntentSample} and {@link NCIntentSampleRef} annotations for given model.
     * <p>
     * This is a convenient shortcut that is equivalent to setting <code>NLPCRAFT_TEST_MODELS</code> system
     * property (overriding any existing value) with given mode class name and calling {@link #isValid()} method.
     *
     * @param claxx Data model class.
     * @return <code>True</code> if no validation errors found, <code>false</code> otherwise. Note that
     *      standard validation output will be printed out to the configured logger (e.g. log4j), if any.
     */
    public static boolean isValid(Class<NCModel> claxx) {
        assert claxx != null;

        System.setProperty(PROP_MODELS, claxx.getName());

        return NCTestAutoModelValidatorImpl.isValid();
    }

    /**
     * Performs validation based on {@link NCIntentSample} and {@link NCIntentSampleRef} annotations for given model.
     * <p>
     * This is a convenient shortcut that is equivalent to setting <code>NLPCRAFT_TEST_MODELS</code> system
     * property (overriding any existing value) with given mode class name and calling {@link #isValid()} method.
     *
     * @param claxx Data model class.
     * @param intentIds Collection of intent IDs to test. If this list is empty or <code>null</code>, all
     *      intents will be tested.
     * @return <code>True</code> if no validation errors found, <code>false</code> otherwise. Note that
     *      standard validation output will be printed out to the configured logger (e.g. log4j), if any.
     */
    public static boolean isValid(Class<NCModel> claxx, Collection<String> intentIds) {
        assert claxx != null;

        System.setProperty(PROP_MODELS, claxx.getName());

        if (intentIds != null && !intentIds.isEmpty())
            System.setProperty(PROP_INTENT_IDS, String.join(",", intentIds));

        return NCTestAutoModelValidatorImpl.isValid();
    }
}
