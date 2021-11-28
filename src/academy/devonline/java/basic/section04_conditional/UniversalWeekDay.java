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
 *
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class UniversalWeekDay {
    public static void main(String[] args) {

        // read source data
        Scanner sc = new Scanner(System.in);
        var isMondayFirst = sc.nextBoolean();
        var day = sc.nextInt();
        String result = null;

        // processing
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (!isMondayFirst) {
            //System.out.println("Array " + Arrays.toString(days));
            int n = 6;
            ShiftToRight(days, n);
        }

        for (int i = 0; i < days.length; i++) {
            if (day == i + 1) {
                result = days[i];
            }
        }

        // display results
        System.out.println(result);

    }

    public static void ShiftToRight(String[] a, int n) {
        String temp = a[n];
        System.arraycopy(a, 0, a, 1, n);
        a[0] = temp;
        //System.out.println("Array after shifting to right by one : " + Arrays.toString(a));
    }
}



