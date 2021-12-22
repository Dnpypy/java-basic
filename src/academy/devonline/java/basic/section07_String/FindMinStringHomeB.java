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

package academy.devonline.java.basic.section07_String;

import java.util.Scanner;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class FindMinStringHomeB {
    public static void main(String[] args) {
        // read source data
        //String[] numsA = {"five", "one", "two", "three", "four"};
        String[] numsB = {"five", "bbbb", "one", "two", "three", "four", "six", "s" };

        //processing
        var minWord = numsB[0];
        for (int i = 0; i < numsB.length; i++) {
            if(numsB[i].compareTo(minWord) < 0) {
                minWord = numsB[0];
            }
        }

        //display result
        System.out.println(minWord);
        System.out.println(minWord.compareTo(numsB[1]));
    }
}
