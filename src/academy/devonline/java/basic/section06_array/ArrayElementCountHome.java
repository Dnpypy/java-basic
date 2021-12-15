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
 * Дан массив: [5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2]
 * <p>
 * Реализовать программу ArrayElementCount, которая выведет на консоль сколько раз встречается число 2 в данном массиве.
 */

public class ArrayElementCountHome {
    public static void main(String[] args) {

        // read source data
        int[] numArray = {5, 2, 2, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        var count = 0;
        var num = 2;

        //processsing
        for (int i = 0; i < numArray.length; i++) {
            if (num == numArray[i]) {
                count++;
            }
        }

        //display results
        System.out.println(count);
    }
}
