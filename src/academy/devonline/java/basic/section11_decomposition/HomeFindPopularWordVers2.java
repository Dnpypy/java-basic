/*
 * Copyright (c) 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package academy.devonline.java.basic.section11_decomposition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class HomeFindPopularWordVers2 {
    public static void main(String[] args) {
        // read source data
        String text = "hello java world java hello I Hello Java World java i i i I I i i";
        // processing
        String word = findMostPopularWordInText(text);
        // display results
        System.out.println(word);
    }

    /**
     *
     * @param text подается исходная строка
     * @return
     */
    private static String findMostPopularWordInText(String text) {
        String[] words = findAllWordsInText(text);
        String[][] uniqueWordsAndCounts = findUniqueWordsAndCounts(words);
        //System.out.println("uniqueWordsAndCounts :" + Arrays.deepToString(uniqueWordsAndCounts));
        return getWordWithMaxCount(uniqueWordsAndCounts);
    }
}
