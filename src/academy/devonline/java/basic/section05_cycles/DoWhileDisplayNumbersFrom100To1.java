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

package academy.devonline.java.basic.section05_cycles;

/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 * Изменить программу DisplayNumbersFrom100To1,
 * которая выводит на консоль все целые числа от 100 до 1 (включительно),
 * так чтобы вместо цикла while использовался цикл do while;
 */
public class DoWhileDisplayNumbersFrom100To1 {
    public static void main(String[] args) {
        // read source data
        var from = 100;
        var to = 1;
        var step = 1;

        // display results
        do {
            System.out.print(from + " ");
            from -=  step;
        }while (from >= to);
    }
}
