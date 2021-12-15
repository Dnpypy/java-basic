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
 * Реализовать программу CheckIfAllNumbersArePositive,
 * которая выводит на консоль сообщение "All positive" если все элементы в
 * массиве больше или равно нули, иначе выводит сообщение: "Not all positive".
 */
public class CheckIfAllNumbersArePositiveHome {
    public static void main(String[] args) {
        // read source data
        //int[] arrayPlus = {1, 2, 3, 4, 5, -6};
        //int[] arrayPlus = {1, 2, 3, 4, 5, -6};
        int[] arrayPlus = {1, 2, 3, 4, 5, 6, -7, -8};
        var plus = 0;

        //processing
        for (int j : arrayPlus) {
            if (j >= 0) {
                plus++;
            }
        }

        //display results
        System.out.println(plus == arrayPlus.length ? "All positive" : "Not all positive");
    }
}
