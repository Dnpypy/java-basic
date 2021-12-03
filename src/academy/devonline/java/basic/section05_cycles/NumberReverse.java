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

import java.util.Scanner;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Реализовать программу NumberReverse, которая для заданного числа создает его реверсивную версию.
 * Реверсивная версия - это число написанное задом наперед, например:
 */
public class NumberReverse {
    public static void main(String[] args) {

        // read source data
        var num = new Scanner(System.in).nextInt();
        var x = 0;
        var lastNum = 0;
        var sign = num > 0 ? 1 : -1;

        //processings
        while (num > 0) {
            // первая итерация
            // lastNum = 4, первая итерация
            lastNum = num % 10;
            // x = 4
            x = x * 10 + lastNum;
            // было 1234 стало 123
            num = num / 10; // входящее число уменьшается каждую итерацию
        }

        // display results
        // на первой итерации 4 * 1 = 4
        System.out.println(x * sign);
    }
}
