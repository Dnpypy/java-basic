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

import java.util.Arrays;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class HomeSwapMinAndMaxArrayElementUsingFunctions {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, 3, 8, 5};

        // processing
        var indexes = getIndexesOfMinAndMaxElements(array);
        swap(array, indexes[0], indexes[1]);

        // display results
        System.out.println(Arrays.toString(array));
    }

    //найти минимальный и максимальный элемент в массивеd
    private static int[] getIndexesOfMinAndMaxElements(int[] array) {
        // индекс мин, значение мин
        var valueMin = array[0];
        var indexMin = 0;
        // индекс макс, значение макс
        var valueMax = array[0];
        var indexMax = 0;
        // цикл поиска и сравнения
        for (int i = 1; i < array.length; i++) {
            var current = array[i];
            if (current > valueMax) {
                valueMax = current;
                indexMax = i;
            }
            if (current < valueMin) {
                valueMax = current;
                indexMin = i;
            }
        }
        //возврат значений
        return new int[]{indexMax, indexMin};
    }

    // поменять местами элементы в массиве
    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
