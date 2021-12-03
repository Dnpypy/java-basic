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

import java.util.Iterator;
import java.util.List;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Реализовать программу SumFrom1To100, которая считает сумму чисел от 1 до 100 включительно используя циклы.
 */
public class SumFrom1To100 {
    public static void main(String[] args) {
        //for
        var sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            sum1 += i;
        }
        System.out.println(sum1);

        //while
        var from = 1;
        var to = 100;
        var step = 1;
        var sum2 = 0;
        while (from <= to) {
            sum2 += from;
            from += step;
        }
        System.out.println(sum2);

        //dowhile
        var f = 1;
        var t = 100;
        var s = 1;
        var sum3 = 0;
        do {
            sum3 += f;
            f += s;
        } while (f <= t);
        System.out.println(sum3);
    }
}
