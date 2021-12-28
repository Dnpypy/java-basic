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

package academy.devonline.java.basic.section09_recursion;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class FindMinElementUsingRecursionHome {


    public static void main(String[] args) {
        int[] array = {1, -2, -8, 0, 5};
        //int[] array = {1, -2, 8, 0, -5};

        System.out.println(findMin(array));
        System.out.println(findMin(array, 1, array[0]));
    }

    // Iterative
    private static int findMin(int[] array) {
        var min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Recursive
    private static int findMin(int[] array, int i, int min) {
        if (i == array.length) {
            return min;
        } else {
            if (array[i] < min) {
                return findMin(array, i + 1, array[i]);
            } else {
                return findMin(array, i + 1, min);
            }
        }
    }
}
