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
 * Реализовать программу SumLibrary, которая будет содержать 5 перегруженных функций с именем sumOf,
 * которые будут принимать два аргумента и возвращать сумму этих аргументов. Перегрузка будет осуществляться по типу аргументов:
 *
 * Первая версия функции должна складывать аргументы типа short, т.е. short + short;
 *
 * Вторая версия функции должна складывать аргументы типа int, т.е. int + int;
 *
 * Третья версия функции должна складывать аргументы типа long, т.е. long + long;
 *
 * Четвертая версия функции должна складывать аргументы типа float, т.е. float + float;
 *
 * Пятая версия функции должна складывать аргументы типа double, т.е. double + double;
 *
 * В теле функции public static void main Вы должны вызвать все пять типов перегруженной функции!
 */
public class SumLibraryHome {
    public static void main(String[] args) {

        System.out.println(sumOf((short)11, (short)222));
        System.out.println(sumOf(1111, 2222));
        System.out.println(sumOf(1L, 2L));
        System.out.println(sumOf(1.f, 2.f));
        System.out.println(sumOf(1., 2.));
    }

    private static int sumOf(short a, short b) {
        return (short) a + b;
    }

    private static int sumOf(int a, int b) {
        return a + b;
    }

    private static long sumOf(long a, long b) {
        return a + b;
    }

    private static float sumOf(float a, float b) {
        return a + b;
    }

    private static double sumOf(double a, double b) {
        return a + b;
    }
}
