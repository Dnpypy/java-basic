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
public class SimplestTextArchiverHome {

    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(8) + "B".repeat(3) + "C".repeat(5);
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
        // инициализация стрингбилдера, предыдущий символ, счетчик
        StringBuilder sb = new StringBuilder();
        var prev = source.charAt(0);
        var count = 1;
        //processing сравнение символа текущего с первым взятым из строки
        // итерация цикл фор и инициализация текущего символа
        for (int i = 1; i < source.length(); i++) {
            var current = source.charAt(i);
            if ( current == prev) {
                count++;
            } else {
                sb.append(prev).append(count);
                prev = current;
                count = 1;
            }

        }
        sb.append(prev).append(count);
        return sb.toString();
    }




    private static String unzip(String zipped) {
        // Your implementation must be here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zipped.length(); i+=2) {
            var ch = zipped.charAt(i);
            //символ преобразуем -> в строку далее -> в число
            int count = Integer.parseInt(String.valueOf(zipped.charAt(i + 1)));
            for (int j = 0; j < count; j++) {
                sb.append(ch);
            }
        }

        //.. возврат в ту стринг
        return sb.toString();
    }
}
