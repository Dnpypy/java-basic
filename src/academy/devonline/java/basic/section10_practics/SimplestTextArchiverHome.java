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

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isDigit;

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
        //..
        //processing сравнение символа текущего с первым взятым из строки
        // итерация цикл фор и инициализация текущего символа
        //..
            // если равны символы то счетчик ++
        //..
                // иначе запись в стрингбилдер друг за другом
        //..
                // тут все меняется предыдущий становится текущим, счетчик опять 1
        //..//..
            }
        }
//..еще раз запись в сб
//.. возврат в ту стринг
    }

    private static String unzip(String zipped) {
        // Your implementation must be here
        //..//..//..
            //символ преобразуем -> в строку далее -> в число
        //..
        //..
        //.. возврат в ту стринг
    }
}
