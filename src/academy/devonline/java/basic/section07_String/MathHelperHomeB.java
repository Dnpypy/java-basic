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
import java.util.Scanner;

public class MathHelperHomeB {
    public static void main(String[] args) {
        // read source data

        //processing
        while (true) {
            System.out.println("Enter cmd: {pi, e, exit or quit}");
            var word = new Scanner(System.in).nextLine();

            //display results
            if(word.equals("pi")) {
                System.out.println(Math.PI);
            } else if(word.equals("e")) {
                System.out.println(Math.E);
            } else if(word.equals("exit") || word.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid cmd. Try again!");
            }
        }
    }
}
