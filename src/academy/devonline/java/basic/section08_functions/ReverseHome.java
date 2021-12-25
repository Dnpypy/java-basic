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

package academy.devonline.java.basic.section08_functions;

import java.util.Arrays;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Благодаря тому, что массивы всегда передаются по ссылке возможно реализовать функцию reverse,
 * которая будет принимать в качестве аргумента массив и модифицировать его,
 * меняя последний элемент с первым, предпоследний со вторым и т.д.
 * <p>
 * Ваша задача: реализовать функцию reverse, используя следующий шаблон:
 * <p>
 * Вывод: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
 */
public class ReverseHome {
    public static void main(String[] args) {
        // read source data
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        // processing
        reverse(array);
        // display results
        System.out.println(Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        // Your implementation must be here
        for (int i = 0; i < array.length / 2; i++) {
            var temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }
}
