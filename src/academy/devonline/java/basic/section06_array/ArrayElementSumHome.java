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
 * Реализовать программу ArrayElementSum, которая рассчитает и выведет на консоль сумму всех элементов массива.
 */

public class ArrayElementSumHome {
    public static void main(String[] args) {
        // read source data
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;

        // processing
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // display results
        System.out.println(sum);
    }
}
