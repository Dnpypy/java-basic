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
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class MultiplicationTableCase1 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i == 1 && j == 1) {
                    System.out.print(" \t");
                } else {
                    System.out.print((i * j) + "\t");
                }
//                var res = i * j;
//                System.out.print(( res == 1 ? "" : res) + "\t");
            }
            System.out.println();
        }
    }
}
