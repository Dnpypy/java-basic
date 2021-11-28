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
 * "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class UniversalWeekDay {
    public static void main(String[] args) {

        // read source data
        Scanner sc = new Scanner(System.in);
        var isMondayFirst = sc.nextBoolean();
        var day = sc.next().charAt(0);

        // processing
        String result;
        if (!isMondayFirst) {
            if (day == '1') { result = "Sunday"; }
            else if (day == '2') { result = "monday"; }
            else if (day == '3') { result = "Tuesday"; }
            else if (day == '4') { result = "Wednesday"; }
            else if (day == '5') { result = "Thursday"; }
            else if (day == '6') { result = "Friday"; }
            else if (day == '7') { result = "Saturday"; }
            else { result = null; }
        } else {
            if (day == '1') { result = "monday"; }
            else if (day == '2') { result = "Tuesday"; }
            else if (day == '3') { result = "Wednesday"; }
            else if (day == '4') { result = "Thursday"; }
            else if (day == '5') { result = "Friday"; }
            else if (day == '6') { result = "Saturday"; }
            else if (day == '7') { result = "Sunday"; }
            else { result = null; }
        }

        // display results
        System.out.println(result);
    }
}
