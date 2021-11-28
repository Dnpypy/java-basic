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

package academy.devonline.java.basic.section04_conditional;

import java.util.Random;
import java.util.Scanner;

/**
 * данный код запишет случайное число в диапазоне 0..9 в переменную number
 * var number = new Random().nextInt(10);
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class GuessTheNumber {
    public static void main(String[] args) {

        // read source data
        var number = new Random().nextInt(10);
        var numUser = new Scanner(System.in).nextInt();
        String win = "Congratulations, you guessed the number!";
        String lose = "Sorry, but your number is invalid! Try again later...";

        // processing
        String result = number == numUser ? win : lose;
        System.out.println(number);

        // display results
        System.out.println(result);
    }
}
