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

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */

public class BinarySearchRecursivesHome {
    public static void main(String[] args) {
        // read source data
        int[] numsArray = {1, 11, 2, 3, 3, 3, 33, 22, 1, 5};
        int result = 0;
        int n = 0;
        int low = 0;
        int high = numsArray.length - 1;

        //processing
        bubbleSort(numsArray);
        System.out.println(Arrays.toString(numsArray));
        result = binarySearchRecursive(numsArray, n, low, high);

        // display results
        System.out.println("Index: " + result);
    }

    private static int binarySearchRecursive(int[] numsArray, int num, int startIndex, int endIndex) {

        if (startIndex <= endIndex) {
            var mid = (startIndex + endIndex) / 2;
            var guess = numsArray[mid];

            if (num > guess) {
                return binarySearchRecursive(numsArray, num, mid + 1, endIndex);
            } else if (num < guess){
                return binarySearchRecursive(numsArray, num, mid - 1, endIndex);
            } else {
                return mid;
            }
        }

        return -1;
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
//    private static int binarySearch(int[] numsArray, int num) {
//        var low = 0;
//        var high = numsArray.length - 1;
//        var mid = 0;
//        var guess = 0;
//
//        while (low <= high) {
//            mid = (low + high) / 2;
//            guess = numsArray[mid];
//
//            if (guess == num) {
//                return mid;
//            }
//
//            if (guess > num) {
//                high = mid - 1;
//            } else {
//                low = mid + 1;
//            }
//        }
//        return -1;
//    }

}
