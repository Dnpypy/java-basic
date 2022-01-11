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
public class HomeFindPopularWord {
    public static void main(String[] args) {
        // read source data
        //String text = "hello java world java hello I Hello Java World java Hello java";
        String text = "hello java world java hello I Hello Java World java i i i I I i i";
        Map<String, Integer> keyNums = new HashMap<>();

        //processing
        CountAndWordAddMap(text, keyNums);
        String PopularWord = getPopularString(keyNums);

        // display results
        System.out.println(PopularWord);

    }

    /**
     * @param keyNums пустой мэп с ключами и значениями
     * @return популярное слово сравненное по значению в карте
     */
    private static String getPopularString(Map<String, Integer> keyNums) {
        var maxValue = Integer.MIN_VALUE;
        String PopularWord = null;
        for (Map.Entry<String, Integer> entry : keyNums.entrySet()) {
            if (entry.getValue() >= maxValue) {
                maxValue = entry.getValue();
                PopularWord = entry.getKey();
            }
        }
        return PopularWord;
    }

    /**
     * @param text исходная строка текста со словами
     * @param map  пустая карта с ключами, где строки-слова, значения-числа - сколько слова встречатся в строке раз
     */
    private static void CountAndWordAddMap(String text, Map<String, Integer> map) {
        var temp = findAllWordsInText(text);

        for (String x : temp) {
            int newValue = map.getOrDefault(x, 0) + 1;
            map.put(x, newValue);
        }
    }

    /**
     * @param text исходная строка текста со словами
     * @return массив слов
     */
    private static String[] findAllWordsInText(String text) {
        return text.toLowerCase().split(" ");
    }
}
