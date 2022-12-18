/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nlpcraft.nlp.enrichers

import com.typesafe.scalalogging.LazyLogging
import org.apache.nlpcraft.*
import org.apache.nlpcraft.internal.util.NCUtils
import org.apache.nlpcraft.nlp.stemmer.NCStemmer

import java.io.*
import java.util.Objects

/**
  * "Swear-word" [[NCTokenEnricher token enricher]].
  *
  * This enricher adds `swear` boolean [[NCPropertyMap metadata]] property to the [[NCToken token]]
  * instance if word it represents is a swear word dictionary, i.e. the swear dictionary contains this word's
  * stem. The value `true` of the metadata property indicates that this word's stem is found in the dictionary,
  * `false` value indicates otherwise.
  *
  * Read more about stemming [[https://en.wikipedia.org/wiki/Stemming here]].
  * Stemming is used here because it is too difficult to be based on more accurate `lemma` approach for swear words.
  *
  * @param dictRes Path to the swear dictionary. The dictionary should have a simple
  *         plain text format with *one word per line*, empty lines are skipped, duplicates ignored, header or other comments allowed.
  *         Headers are lines started by **#** symbol. Search in the dictionary is implemented by input words **stems**, case is ignored.
  * @param stemmer Stemmer implementation for the dictionary language.
  */
//noinspection ScalaWeakerAccess
class NCSwearWordsTokenEnricher(dictRes: String, stemmer: NCStemmer) extends NCTokenEnricher with LazyLogging:
    require(dictRes != null, "Swear words model file cannot be null.")
    require(stemmer != null, "Stemmer cannot be null.")

    private var swearWords: Set[String] = _

    init()

    private def init(): Unit =
        swearWords = NCUtils.readLines(res = dictRes, convert = s => stemmer.stem(s.toLowerCase), filterText = true, log = logger).toSet

    /** @inheritdoc */
    override def enrich(req: NCRequest, cfg: NCModelConfig, toks: List[NCToken]): Unit =
        toks.foreach(t => t.put("swear", swearWords.contains(stemmer.stem(t.getText.toLowerCase))))

