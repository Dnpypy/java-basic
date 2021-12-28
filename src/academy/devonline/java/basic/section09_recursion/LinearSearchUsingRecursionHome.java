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
public class LinearSearchUsingRecursionHome {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var query = 6;

        System.out.println(findIndex(array, query));
        System.out.println(findIndex(array, query, 0));
    }

    // Recursive
    private static int findIndex(int[] array, int query, int i) {
        // дошли до конца и не нашли нужный элемент
        if (i == array.length) {
            return -1;
            // элемент нашли - выход из рекурсии с этим элементом в массиве
        } else if (array[i] == query) {
            return array[i];
            // иначе переходим к следующему элементу
        } else {
            return findIndex(array, query, i + 1);
        }
    }



    // Iterative
    private static int findIndex(int[] array, int query) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == query) {
                return i;
            }
        }
        return -1;
    }
}
