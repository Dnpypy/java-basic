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

import java.util.Arrays;

import static java.lang.Character.isDigit;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class SimplestTextArchiverHome {
    public static void main(String[] args) {
        // read source data
        //String source = "A".repeat(8) + "B".repeat(3) + "C".repeat(5);
        String source = "ABC";
        System.out.println("Source text:   " + source);

        // processing
        String zipped = zip(source);
        // display results
        System.out.println("Zipped text:   " + zipped);

        // processing
        String unzipped = unzip(zipped);
        // display results
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        // Your implementation must be here
        char[] charArray = new char[source.length()];
        var count = 0;  // сколько раз встречается символ
        StringBuilder nameBuilder = new StringBuilder();
//stringBuilder.indexOf(charactersYouWantToCheck)!=-1
        for (int i = 1; i < source.length(); i++) {
            var index = source.charAt(0);
            var ch = source.charAt(i);
            if (ch == index) { // если число добавляю в builder
                nameBuilder.append(ch);
                count++;
            } else if (nameBuilder.length() > 0) {// если numberBuilder не пустой
                results[count++] = Integer.parseInt(nameBuilder.toString());
                //... // обнуление numberBuilder
                nameBuilder.setLength(0);
            }
        }
        return null;
    }

    private static String unzip(String zipped) {
        // Your implementation must be here
        return null;
    }
}
