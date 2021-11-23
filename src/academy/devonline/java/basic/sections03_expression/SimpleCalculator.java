package academy.devonline.java.basic.sections03_expression;
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
import java.util.Scanner;
/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class SimpleCalculator {

    /**
     * class variables
     */
    static Scanner sc = new Scanner(System.in);
    static int a;
    static int b;

    public static void main(String[] args) {
        variablesA();
        variablesB();
        calculator(a, b);
    }

    static void variablesA() {
        System.out.println("Enter 'a': ");
        a = sc.nextInt();
    }

    static void variablesB() {
        System.out.println("Enter 'b': ");
        b = sc.nextInt();
    }

    static void calculator(int a, int b) {
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }
}
