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

import java.util.Scanner;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */

public class LinearSearchHome {
    public static void main(String[] args) {

        // read source data
        int[] array1 = {11, 21, 31, 41, 51};
        //int[] array2 = new int[0];
        String no = "item not found";
        String yes = "item found: ";
        boolean flag = true;

        // processing
        while (flag) {
            var num = new Scanner(System.in).nextInt();

            //display results
            if(isArrayEmpty(array1)) {
                System.out.println("EMPTY ARRAY");
                flag = false;
            } else {
                if (lineanSearch(array1, num) == -1) {
                    System.out.println(no);
                } else {
                    System.out.println(yes + (lineanSearch(array1, num) + 1));
                    flag = false;
                }
            }
        }
    }

    /**
     *
     * @param array elements
     * @return true if empty length 0
     */
    static boolean isArrayEmpty(int[] array) {
        return array.length == 0;
    }

    /**
     *
     * @param arr array elements
     * @param key user entered number
     * @return if found, return the index of the number or -1
     */
    static int lineanSearch(int[] arr, int key) {
        var temp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                temp = i;
            }
        }
        return temp;
    }
}
