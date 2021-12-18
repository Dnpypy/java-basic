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
 * Алгоритм:
 * <p>
 * Создаем массив, который будут хранить уникальные элементы исходного массива (массив unique) и массив, который будет хранить количество повторений уникального элемента в исходном массиве (массив counts).  Связь между этими массивами осуществляется по индексу, т.е. чтобы узнать количество повторений для уникального элемента, необходимо в массиве unique узнать индекс данного уникального элемента и по этому индексу запросить количество повторений в массиве counts;
 * <p>
 * Для хранения количества найденных уникальных элементов, необходимо создать переменную счетчик.
 * <p>
 * Выполняем проход по исходному массиву данных слева направо с помощью цикла;
 * <p>
 * Получаем текущий элемент по индексу i;
 * <p>
 * Проверяем если ли текущий элемент в массиве unique;
 * <p>
 * Если есть, значит для данного элемента уже было посчитано количество вхождений, поэтому переходим к следующему элементу в исходном массиве;
 * <p>
 * Если нет, то считаем сколько раз данный элемент встречался в массиве;
 * <p>
 * После подсчета добавляем запись в массивы unique и counts;
 * <p>
 * После того как мы закончили проход по исходному массиву, необходимо пройтись по массиву уникальных элементов и отобразить его и процент вхождения (Так как размер данных массивов изначально был задан большим, необходимо использовать счетчик уникальных элементов, чтобы отображать только результаты работы данной программы);
 * <p>
 * Процент вхождения рассчитывается как ((double)counts[i] * 100 / array.length)
 */
public class ArrayElementStatisticHomeB {
    public static void main(String[] args) {
        //read source date
        //int[] nums = {1, 2, 3, 2, 2, 2, 3, 3, 4, 4, 4};
        int[] nums = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var size = nums.length;
        int[] unique = new int[size];
        int[] counts = new int[size];
        var count = 0;

        //processing
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < unique.length; j++) {
//                if (nums[i] == unique[j]) {
//                    counts[j] = count++;
//                } else {
//                    unique[j] = nums[i];
//                    counts[j] = count++;
//                }
//            }
//        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == unique[i]) {
                count++;
                counts[i] = count;
            } else {
                unique[i] = nums[i];
                count++;
                counts[i] = count;
            }
        }
        System.out.println(Arrays.toString(unique));
        //display results
        for (int i = 0; i < unique.length; i++) {
            System.out.println(unique[i] + " " + (double)counts[i] * 100 / unique.length);
        }

    }
}

