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

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * a = 123456789012345678901234567890123456789012345678901234567890
 * b = 12345678901234567890123456789012345678901234567890
 * a + b = 123456789024691357802469135780246913578024691357802469135780
 * //-------------------------------------------------------------------
 * a = 1
 * b = 999999999999999999999999999999999999999999999999999999999999
 * a + b = 1000000000000000000000000000000000000000000000000000000000000
 * //-------------------------------------------------------------------
 * a = 9876543210987654321098765432109876543210987654321
 * b = 1111111111111111111111111111111111111111111111111
 * a + b = 10987654322098765432209876543220987654322098765432
 */

public class BigIntegerSumHome {
    public static void main(String[] args) {
        // read source data
        var a = "123456789012345678901234567890123456789012345678901234567890";
        var b = "12345678901234567890123456789012345678901234567890";

        //processing
        var num1 = a.length() >= b.length() ? a : "0".repeat(b.length() - a.length()) + a;
        var num2 = b.length() >= a.length() ? b: "0".repeat(a.length() - b.length()) + b;

        StringBuilder res = new StringBuilder();
        int prevDigit = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            var digit1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
            var digit2 = Integer.parseInt(String.valueOf(num2.charAt(i)));
            int sum = digit1 + digit2 + prevDigit;
            if (sum > 9) {
                prevDigit = 1;
                sum = sum % 10;
            } else {
                prevDigit = 0;
            }
            res.insert(0, sum);
        }
        if (prevDigit != 0) {
            res.insert(0, prevDigit);
        }

        // display results
        System.out.println(res.toString());
        System.out.println(new BigInteger(a).add(new BigInteger(b)));

        //display results
        System.out.println(res.toString());
        System.out.println(new BigInteger(a).add(new BigInteger(b)));
    }
}
