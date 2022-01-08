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
public class HomePrintArrayElementsMoreThanAvg {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 4, -5, -2, 0, 12};

        // processing
        var numAverage = getAverageArrayElement(array);
        var countElements = getCountElements(array, numAverage);
        var numsMaxElementAverage = getMaxArrayElements(array, numAverage, countElements);

        // display results
        System.out.println(Arrays.toString(numsMaxElementAverage));
    }

    /**
     * var array исходный массив
     * var n среднее арифметическое по массиву
     * var sizeArray размер нового массива
     * return ar возвращаю новый массив
     **/
    private static int[] getMaxArrayElements(int[] array, int numAverage, int sizeArray) {
        int[] ar = new int[sizeArray];
        var count = 0;
        for (int j : array) {
            if (j > numAverage) {
                ar[count] = j;
                count++;
            }
        }
        return ar;
    }

    /**
     * var array исходный массив
     * var n среднее арифметическое по массиву
     * return возвращаю новый размер массива
     **/
    private static int getCountElements(int[] array, int n) {
        var size = 0;
        for (int j : array) {
            if (j > n) {
                size++;
            }
        }
        return size;
    }

    /**
     * var array исходный массив
     * return average возвращаю среднее арифм из чисел массива
    **/
    private static int getAverageArrayElement(int[] array) {
        var size = array.length;
        var sum = 0;
        var average = 0;
        for (int j : array) {
            sum += j;
        }
        average = (sum / size);
        return average;
    }
}
