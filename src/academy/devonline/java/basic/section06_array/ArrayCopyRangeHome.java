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
 * Дан массив {1, 2, 3, 4, 5} и два индекса: startIndex и endIndex.
 * <p>
 * Реализовать программу ArrayCopyRange, которая создаст новый массив,
 * скопирует в него все элементы исходного массива начиная со startIndex
 * и заканчивая endIndex и выведет скопированный массив на консоль!
 * <p>
 * В процессе реализации обратить внимание на:
 * <p>
 * Во всех функциях и методах из стандартной библиотеки Java при копировании элементов,
 * используя индексы начального и последнего элементов используется следующее правило:
 * начальный элемент попадает в результат, а последний нет!
 * <p>
 * Т.е. если для массива,
 * состоящего из пяти элементов будут следующие параметры startIndex = 1 и endIndex = 3,
 * то в результат должны попасть элементы под индексами 1 и 2!
 * <p>
 * Элемент под индексом endIndex = 3 НЕ ПОПАДАЕТ В РЕЗУЛЬТАТ! В вашей программе,
 * которую Вам необходимо реализовать в рамках данного практического задания
 * по аналогии со стандартной библиотекой Java необходимо следовать этому же самому принципу!
 * <p>
 * Предполагается, что значения startIndex и endIndex - корректные,
 * т.е. проверку на их корректность выполнять в программе не нужно!
 */
public class ArrayCopyRangeHome {

    private static int[] array;
    private static int[] temp;
    private static int size = 0;
    //static int[] newArray;

    public static void main(String[] args) {
        // read source data
        int[] arrayNum = {11, 454, 78, 444, 5};
        int startIndex = 2;
        int endIndex = 4;

        // processing
        // size array
        array = new int[arrayTempCopy(startIndex, endIndex, arrayNum)];

        // array with zero
        array = arrayNewCreate();

        //display result
        System.out.println(Arrays.toString(array));
    }

    /**
     * @param start index
     * @param end   index
     * @param arr   current array
     *              the method takes the initial and final index values,
     *              fills in the temporary array, and calculates the size of the array without zeros
     */
    public static int arrayTempCopy(int start, int end, int[] arr) {
        size = 0;
        temp = new int[arr.length];
        for (int i = start; i < end; i++) {
            temp[i] = arr[i];
            if (temp[i] != 0)
                size++;
        }
        return size;
    }

    public static int[] arrayNewCreate() {
        int[] temp2 = new int[size];
        var j = 0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] != 0) {
                temp2[j] = temp[i];
                j++;
            }
        }
        return temp2;
    }

}
