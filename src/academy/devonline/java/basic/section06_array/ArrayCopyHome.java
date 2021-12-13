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

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Дан массив {1, 2, 3, 4, 5}.
 *
 * Реализовать программу ArrayCopy, которая создаст новый массив,
 * скопирует в него все элементы исходного массива и выведет скопированный массив на консоль
 */
public class ArrayCopyHome {

    static int[] array;

    public static void main(String[] args) {
        // read source data
        int[] arrayNum = {11, 222, 333, 444, 5};

        // read source data
        arrayCopy(arrayNum);

        // display results
        for (Integer j: array) {
            System.out.print(j + " ");
        }
    }

    public static void arrayCopy(int[] a) {
        array = new int[a.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = a[i];
        }

        //System.arraycopy(a, 0, array, 0, array.length);

    }
}
