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
     * @param text подается исходная строка
     * @return слово встречающееся в тексте максимальное количество раз
     */
    private static String findMostPopularWordInText(String text) {
        String[] words = findAllWordsInText(text);
        String[][] uniqueWordsAndCounts = findUniqueWordsAndCounts(words);
        //System.out.println("uniqueWordsAndCounts :" + Arrays.deepToString(uniqueWordsAndCounts));
        return getWordWithMaxCount(uniqueWordsAndCounts);
    }

    /**
     * @param uniqueWordsAndCounts двумерный массив состоящий из уникальных слов и их количество совпадений
     * @return слово встречающееся в тексте максимальное количество раз
     */
    private static String getWordWithMaxCount(String[][] uniqueWordsAndCounts) {
        String word = uniqueWordsAndCounts[0][0];
        int maxCount = Integer.parseInt(uniqueWordsAndCounts[0][1]);
        for (int i = 1; i < uniqueWordsAndCounts.length; i++) {
            int currentCount = Integer.parseInt(uniqueWordsAndCounts[i][1]);
            if(currentCount > maxCount) {
                maxCount = currentCount;
                word = uniqueWordsAndCounts[i][0];
            }
        }
        return word;
    }

    /**
     * @param text подается исходная строка
     * @return слова разделенные пробелом и привиденные к нижнему регистру
     */
    private static String[] findAllWordsInText(String text) {
        return text.toLowerCase().split(" ");
    }

    /**
     * @param words исходный массив слов
     * @return возращает двумерный массив состоящий из уникальных слов и их количество совпадений
     */
    private static String[][] findUniqueWordsAndCounts(String[] words) {
        String[] uniqueWords = new String[words.length];
        String[] counts = new String[words.length];
        int count = 0;
        for (String word : words) {
            var lowerCaseWord = word.toLowerCase();
            if (!isAlreadyProcessed(uniqueWords, lowerCaseWord, count)) {
                int total = calculateWords(words, lowerCaseWord);
                uniqueWords[count] = lowerCaseWord;
                counts[count] = String.valueOf(total);
                count++;
            }
        }
        return convertResults(uniqueWords, counts, count);
    }

    /**
     * @param uniqueWords массив с уникальными словами
     * @param counts массив с количеством совпадений отдельно взятого слова
     * @param count счетчик индекс
     * @return возращает двумерный массив состоящий из уникальных слов и их количество совпадений
     */
    private static String[][] convertResults(String[] uniqueWords, String[] counts, int count) {
        String[][] result = new String[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = uniqueWords[i];
            result[i][1] = counts[i];
        }
        return result;
    }

    /**
     * @param words главный массив со словами
     * @param word  слово из текущего массива, привиденная к нижнему регистру
     * @return счетчик(количество) совпадений
     */
    private static int calculateWords(String[] words, String word) {
        int count = 0;
        for (String w : words) {
            if (word.equalsIgnoreCase(w)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param uniqueWords массив с уникальными словами
     * @param word        слово из текущего массива, привиденная к нижнему регистру
     * @param count       счетчик - индекс для массивов uniqueWords, counts
     * @return true если слово совпадает иначе false
     */
    private static boolean isAlreadyProcessed(String[] uniqueWords, String word, int count) {
        for (int i = 0; i < count; i++) {
            if (uniqueWords[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}
