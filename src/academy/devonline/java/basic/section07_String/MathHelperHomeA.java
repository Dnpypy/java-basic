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

package academy.devonline.java.basic.section07_String;

import java.util.Scanner;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class MathHelperHomeA {

    static boolean flag = true;

    public static void main(String[] args) {

        // read source data

        var PI = 3.141592653589793;
        var E = 2.718281828459045;

        //processing

        while (trFlag(flag)) {
            var cmd = new Scanner(System.in).next();
            switch (cmd) {
                //display results
                case "pi" -> System.out.println(PI);
                case "e" -> System.out.println(E);
                case "quit" -> flag = false;
                case "exit" -> flag = false;
                default -> System.out.println("Invalid cmd. Try again!");
            }
        }
    }

    /**
     * @param a accepts the incoming boolean flag parameter
     * @return flag false of true
     */
    static boolean trFlag(boolean a) {
        if (a) {
            System.out.println("Enter cmd: {pi, e, exit or quit}");
            boolean flag = a;
        }
        return flag;
    }
}
