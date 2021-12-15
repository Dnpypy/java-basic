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

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 * Алгоритм поиска минимального элемента для массива [1, -2, 8, 0, 5] следующий:
 * <p>
 * Изначально предполагаем что минимальный элемент - это первый элемент массива;
 * <p>
 * Поэтому создаем переменную min и записываем в нее первый элемент массива (по индексу 0);
 * <p>
 * Далее используя цикл необходимо пройтись по массиву, начиная со второго элемента;
 * <p>
 * На каждой итерации цикла запрашиваем текущий элемент массива по индексу i;
 * <p>
 * Если текущий элемент массива меньше чем минимальный, то тогда минимальному элементу присваиваем текущий;
 * <p>
 * После того как мы закончили проходить по массиву циклом в переменной min - находится минимальный элемент всего массива;
 */

public class FindMinElementHomeTwoVersion {
    public static void main(String[] args) {
        // read source data
        int[] minArray = {1, -2, 8, 0, 5};
        var min = minArray[0];

        // processing
        for (int i = 1; i < minArray.length; i++) {
            if (min > minArray[i]) {
                min = minArray[i];
            }
        }

        // display results
        System.out.println(min);
    }
}
