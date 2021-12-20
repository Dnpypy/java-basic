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
public class ArrayElementStatisticHomeB {
    public static void main(String[] args) {

        //read source date
        int[] nums = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var size = nums.length;
        int[] unique = new int[size];
        int[] counts = new int[size];

        //кол-во найденных уникальных элементов в текущем массиве
        var count = 0;

        //processing
        for (int i = 0; i < size; i++) {
            var element = nums[i];

            /*
            Проверяем если ли текущий элемент в массиве unique
            Если есть, значит для данного элемента уже было посчитано количество вхождений,
            поэтому переходим к следующему элементу в исходном массиве;
            */
            var exist = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == element) {
                    exist = true;
                    break;
                }
            }

            /*Если нет, то считаем сколько раз данный элемент встречался в массиве*/
            if (!exist) {
                var number = 1;
                for (int j = i + 1; j < size; j++) {
                    if (element == nums[j]) {
                        number++;
                    }
                }
                unique[count] = element;
                counts[count] = number;
                count++;
            }
        }

        //display results
        System.out.println("Массив уникальных элементов : " + Arrays.toString(counts));
        System.out.println("Количество уникальных элементов : " + (count));

        for (int i = 0; i < count; i++) {
            System.out.println(unique[i] + " = " + (double) counts[i] * 100 / unique.length + " %");
        }


    }
}
