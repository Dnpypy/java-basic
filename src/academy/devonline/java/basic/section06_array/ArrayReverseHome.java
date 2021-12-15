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

package academy.devonline.java.basic.section06_array;

import java.util.Arrays;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Реализовать программу ArrayReverse, которая переставляет порядок в исходном массиве таким образом,
 * чтобы первый элемент стал последним, а последний первым, затем втором элемент стал предпоследним, а предпоследний стал вторым и т.д.
 * <p>
 * Пример:
 * <p>
 * [1, 2, 3, 4, 5] // Массив с исходными данными
 * [5, 4, 3, 2, 1] // Массив с обновленными данными
 * Важно: выводить нужно массив средствами Arrays.toString и в качестве аргумента передавать тот же самый массив.
 * Т.е. реализации которые просто будут выводит исходный массив с конца без его изменения или выводит другой массив,
 * а не исходный считаются некорректными!
 */

public class ArrayReverseHome {
    public static void main(String[] args) {

        // read source data
        int[] reverseArray = {1, 2, 3, 4, 5};

        //processing
        for (int i = 0; i < reverseArray.length; i++) {
            var temp = reverseArray[reverseArray.length - 1 - i];
            reverseArray[reverseArray.length - 1 - i] = reverseArray[i];
            reverseArray[i] = temp;
            if (reverseArray[i] == reverseArray[reverseArray.length - 1 - i]) {
                break;
            }
        }

        //display results
        System.out.println(Arrays.toString(reverseArray));
    }
}
