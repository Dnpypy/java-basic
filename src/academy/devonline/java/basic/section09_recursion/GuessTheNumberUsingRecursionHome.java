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

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberUsingRecursionHome {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        numberUsingIteractive(number);
        numberUsingRecursive(number);
        //code
    }

    private static void numberUsingIteractive(int num) {
        while (true) {
            // read source data
            var userCase = new Scanner(System.in).nextInt();

            // processing
            if (num > userCase) {
                // display results
                System.out.println("num > " + userCase + ". Try again:");
            } else if (num < userCase) {
                // display results
                System.out.println("num < " + userCase + ". Try again:");
            } else {
                // display results
                System.out.println("Congratulations, you guessed the num!");
                break;
            }
        }
    }

    private static void numberUsingRecursive(int num) {
        // read source data
        var userCase = new Scanner(System.in).nextInt();

        // processing
        if (num > userCase) {
            // display results
            numberUsingRecursive(num);
            System.out.println("num > " + userCase + ". Try again:");

        } else if (num < userCase) {
            // display results
            numberUsingRecursive(num);
            System.out.println("num < " + userCase + ". Try again:");

        } else {
            // display results
            System.out.println("Congratulations, you guessed the num!");
        }
    }
}
