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
 * @author devonline
 * @link http://devonline.academy/java-basic
 * Дан массив [1, -2, 8, 0, 5].
 *
 * Реализовать программу FindMinElement, которая найдет минимальный элемент и выведет его на консоль.
 * */

public class FindMinElement {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, -2, -8, 0, 5};

        // processing
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // display results
        System.out.println(min);
    }
}
