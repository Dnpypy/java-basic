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

package academy.devonline.java.basic.section10_practics;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class FizzBuzzHome {
    public static void main(String[] args) {
        // read source data
        var from = 1;
        var to = 20;
        var three = 3;
        var five = 5;

        //processing
        for (int i = from; i <= to; i++) {
            //display results
            if (i % three == 0 && i % five == 0) {
                System.out.println("FizzBuzz");
            } else if (i % three == 0) {
                System.out.println("Fizz");
            } else if (i % five == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
    }
}

