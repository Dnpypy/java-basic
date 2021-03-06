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

import java.util.Scanner;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        // read source data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        var a = sc.nextInt();
        System.out.println("Enter b:");
        var b = sc.nextInt();
        System.out.println("Enter operator: {+,-,*,/,%}");
        var operator = sc.next().charAt(0);

        // processing
        String result;
        if (operator == '+') {
            result = "a + b = " + (a + b);
        } else if (operator == '-') {
            result = "a - b = " + (a - b);
        } else if (operator == '*') {
            result = "a * b = " + (a * b);
        } else if (operator == '/') {
            result = "a / b = " + (a / b);
        } else if (operator == '%') {
            result = "a % b = " + (a % b);
        } else {
            result = "Unsupported operator: " + operator;
        }

        // display results
        System.out.println(result);
    }
}
