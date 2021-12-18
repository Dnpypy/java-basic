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
package academy.devonline.java.basic.section06_array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Дан массив: [5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2]
 * <p>
 * Реализовать программу ArrayElementStatistic, которая отображает статистику:
 * уникальный элемент в массиве и процент его повторений в этом же массиве.
 * <p>
 * Порядок отображения элементов равен порядку их в исходном массиве (т.е. сортировать элементы НЕ НУЖНО)!
 * <p>
 * Результат работы программы для данного массива:
 * <p>
 * 5=8.333333333333334%
 * 2=50.0%
 * 3=25.0%
 * 4=16.666666666666668%
 * Т.е. исходный массив содержит 12 элементов. Число 2 повторяется 6 раз. 6 - это половина от 12,
 * т.е. в исходном массиве 50% чисел являются числом 2!
 * <p>
 * По такому же принципу необходимо определить проценты вхождения всех остальных чисел в массиве!
 */
public class ArrayElementStatisticHome {
    public static void main(String[] args) {
        //read source date
        //int[] nums = {1, 2, 3, 2, 2, 2, 3, 3, 4, 4, 4};
        int[] nums = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var size = nums.length;
        var hundred = 100;
        Map<Integer, Integer> keyNums = new HashMap<>();
        DecimalFormat df = new DecimalFormat("#.##");

        //processing
        /*
         * метод getOrDefault - значение по умолчанию
         * если с таким ключем нет значения 0, иначеы + 1
         **/
        for (int x : nums) {
            int newValue = keyNums.getOrDefault(x, 0) + 1;
            keyNums.put(x, newValue);
        }

        //display results
        System.out.println(size);
        System.out.println(keyNums);

        for (Map.Entry<Integer, Integer> pair: keyNums.entrySet()) {
            System.out.println(pair.getKey() + " " + df.format(((double) pair.getValue() * hundred / size)) + " %");
        }
    }
}
