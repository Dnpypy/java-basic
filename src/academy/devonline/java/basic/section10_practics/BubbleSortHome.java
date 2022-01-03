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

package academy.devonline.java.basic.section10_practics;

import java.util.Arrays;

import static java.lang.Character.isDigit;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
import java.util.Arrays;

public class BubbleSortHome {
    public static void main(String[] args) {
        // read source data
        //int[] numsArray = {1, 11, 2, 33, 22, 1, 5};
        int[] numsArray = {1, 11, 2, 3, 3, 3, 33, 22, 1, 5};
        System.out.println(Arrays.toString(numsArray));

        //processing
        bubbleSort(numsArray);

        //display results
        System.out.println(Arrays.toString(numsArray));

    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                var temp = arr[i];
                if (temp > arr[j]) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
