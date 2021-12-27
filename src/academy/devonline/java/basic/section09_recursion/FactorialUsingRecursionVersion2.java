
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
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class FactorialUsingRecursionVersion2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial2(1, 10, 1));
    }

    private static int factorial2(int from, int to, int result) {
        if (from > to) {
            return result;
        } else {
            return factorial2(from + 1, to, result * from);
        }
    }

    private static int factorial(int value) {
        if (value == 0 || value == 1) {
            return 1;
        } else {
            return value * factorial(value - 1);
        }
    }


}