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

import java.util.*;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class HomeFindPopularWordVers3 {
    public static void main(String[] args) {
        // read source data
        //String text = "hello java world java hello I Hello Java World java i i i I I i i";
       //String text = "hello,java-world\tjava hello: I? Hello! Java World. java-hello-java/world=world:world";
        String text = "hello,java-world\tjava    hello: I? Hello! Java World. java";
        //String text = "hello java world java hello I Hello Java World java Hello java";
       // String text = "hello java world java hello I Hello Java World java Hello java I I I I I I I";
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
        System.out.println(Arrays.toString(temp));
        for (String x : temp) {
            int newValue = map.getOrDefault(x, 0) + 1;
            map.put(x, newValue);
        }
    }


    /**
     * @param text исходная строка текста со словами
     * @return массив слов
     * [^] - выбирает любой символ который НЕ перечислен внутри квадратных скобок
     */
    private static String[] findAllWordsInText(String text) {
        //return text.replaceAll("[^a-zA-Z]", " ").split(" ");
        //return text.replaceAll("\\s[^a-zA-Z]", " ").split(" ");
       // return text.replaceAll("\\s[^a-zA-Z]", "").toCharArray();
        return text.replaceAll("\\s+", " ").split(" ");
    }
}
