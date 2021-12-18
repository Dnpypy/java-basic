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

import java.util.Arrays;
import java.util.HashMap;

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

        // read source data
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int[] emptyArray1 = {};
        HashMap<Integer, Integer> copyNumbers = new HashMap<>();

        var numbers = array.length;
        /*Чтобы посчитать сколько процентов будет, нужно нужное количество разделить на общее количество чего-то.
                И умножить на 100. Например: 15 человек из 30, делим 15 на общее количество (30).*/
        var count = 0;
        //var num = array[0];
        copyNumbers.put(array[0], 0);
        //System.out.println(copyNumbers);

        //processing
        for (int i = 0; i < array.length; i++) {

            for (String key : copyNumbers.keySet()) {
                if (key == array[i]) {
                    count++;
                } else {

                }
            }

        }
//        for (int i = 0; i < array.length; i++) {
//            int finalI = i;
//            copyNumbers.put(array[i], 0);
//            copyNumbers.forEach((key, value) -> {
//                if (key.equals(array[finalI])) {
//                    copyNumbers.put(key, value + 1);
//                }
//            });
//        }
//        System.out.println(copyNumbers);

    }
}
