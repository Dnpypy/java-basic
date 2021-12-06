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
 * Реализовать программу Factorial, которая рассчитывает факториал числа.
 *
 * (Факториал числа n (обозначается как n!) - это результат умножения всех целых чисел от 1 до n включительно). например
 * если пользователь введет число, которое меньше нуля, то отобразить сообщение: "Value should be >=0";
 *
 * если в процессе вычисления факториала произошло переполнение результата, то прервать вычисление и отобразить сообщение об ошибке: "Int overflow"
 *
 * если вычислить факториал возможно, то с помощью цикла перемножить числа от 1 до введенного пользователем и вывести результат на консоль
 *
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class Factorial {

    private static int limit = 0;
    private static int fact = 1;

    public static void main(String[] args) {
        // read source data
        while (true) {
            limit = new Scanner(System.in).nextInt();
            factorial();
            if (limit <= 0) {
                System.out.println("Value should be >=0");
            } else if (fact == 0){
                System.out.println("Int overflow");
            } else {
                System.out.println(fact);
                break;
            }
            fact = 1;
        }
    }

    static int factorial() {
        for (int i = 1; i <= limit; i++) {
            var oldFact = fact;
            fact *= i;
            if (oldFact != fact / i) {
                fact = 0;
                break;
            }

        }
        return fact;
    }
}
