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

package academy.devonline.java.basic.section08_functions;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Реализовать программу SumFunctionWithVarArgs, которая будет содержать функцию с именем sumOf,
 * которая будет принимать переменное число параметров типа int и возвращать их сумму
 */
public class SumFunctionWithVarArgsHome {
    public static void main(String[] args) {

        System.out.println(sumOf());
        System.out.println(sumOf(1));
        System.out.println(sumOf(1, 2));
    }

    private static int sumOf(int...args) {
        var sum = 0;
        for (int arg : args) {
            sum += arg;
        }
        return sum;
    }

}
