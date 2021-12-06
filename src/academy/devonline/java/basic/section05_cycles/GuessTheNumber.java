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

package academy.devonline.java.basic.section05_cycles;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Изменить программу GuessTheNumber, которая просит пользователя угадать число, которое загадал компьютер. Компьютер может загадать любой целое число в диапазоне от 0 до 9 включительно. После этого программа просит пользователя ввести число.
 * <p>
 * если пользователь угадает число, то отобразить сообщение: "Congratulations, you guessed the number!";
 * <p>
 * если пользователь ввел число, которое больше чем загаданное компьютером, то отобразить сообщение: "number < ${ВВЕДЕННОЕ_ПОЛЬЗОВАТЕЛЕМ_ЧИСЛО}. Try again:" и запросить новую версию числа;
 * <p>
 * если пользователь ввел число, которое меньше чем загаданное компьютером, то отобразить сообщение: "number > ${ВВЕДЕННОЕ_ПОЛЬЗОВАТЕЛЕМ_ЧИСЛО}. Try again:" и запросить новую версию числа
 * <p>
 * Т.е. программа будет бесконечно запрашивать число от пользователя, пока он его не угадает. Пример вывода программы:
 */

public class GuessTheNumber {
    public static void main(String[] args) {

        // read source data
        var number = new Random().nextInt(10);
        String win = "Congratulations, you guessed the number!";
        String lose = "Sorry, but your number is invalid! Try again later...";
        String result = null;
        boolean flag = true;
        System.out.println(number);
        // processing
        while (flag) {
            var numUser = new Scanner(System.in).nextInt();
            if (number == numUser) {
                result = win;
                flag = false;
            } else if (number < numUser) {
                System.out.println("number < " + numUser + " Try again:");
            } else if (number > numUser) {
                System.out.println("number > " + numUser + " Try again:");
            } else {
                System.out.println(lose);
            }
        }

        // display results
        System.out.println(result);
    }
}
