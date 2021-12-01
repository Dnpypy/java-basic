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
 * алгоритм:
 * год, номер которого кратен 400, — високосный;
 *
 * остальные годы, номер которых кратен 100, — невисокосные;
 *
 * остальные годы, номер которых кратен 4, — високосные;
 *
 * остальные годы - невисокосные.
 *
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class LeapYear {
    public static void main(String[] args) {
        var year = new Scanner(System.in).nextInt();

        String result = year % 400 == 0 ? "високосный" :
                        year % 100 == 0 ? "невисокосные" :
                        year % 4 == 0 ? "високосные" : "невисокосные";

        System.out.println(result);
    }
}
