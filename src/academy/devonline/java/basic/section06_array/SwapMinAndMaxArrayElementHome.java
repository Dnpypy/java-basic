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
 * Реализовать программу SwapMinAndMaxArrayElement, которая меняет местами минимальный и максимальный элементы в массиве. Например:
 * <p>
 * [1, -2, 3, 8, 5]  // Массив с исходными данными
 * [1, 8, 3, -2, 5]  // Результат: элементы -2 и 8 - это min и max элементы соответственно
 * // и их местоположение в результирующем массиве изменено
 */

public class SwapMinAndMaxArrayElementHome {
    public static void main(String[] args) {
        // read source data
        int[] originalArray1 = {1, -2, 3, 8, 5};
//        int[] originalArray2 = {-10, -2, 3, 8, 57};
//        int[] originalArray3 = {0, 0, 3, 8, 57};
        //int[] originalArray4 = {0, 0, -99, 8, 1};

        System.out.println(Arrays.toString(originalArray1));

        //processing
        var min = Integer.MAX_VALUE;
        var max = Integer.MIN_VALUE;
        var minI = 0;
        var maxI = 0;
        for (int i = 0; i < originalArray1.length; i++) {
            if (min > originalArray1[i]) {
                min = originalArray1[i];
                minI = i;
            }
            if (max < originalArray1[i]) {
                max = originalArray1[i];
                maxI = i;
            }
        }
        originalArray1[minI] = max;
        originalArray1[maxI] = min;

        //display results
        System.out.println(Arrays.toString(originalArray1));
    }
}
