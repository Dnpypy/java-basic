package academy.devonline.java.basic.section02_structure;
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
public class DataTypes {
    public static void main(String[] args) {
        // примитивный тип данных
        // целое число
        int i = 0;
        // его диапазон
        System.out.println(Integer.MIN_VALUE + " < " + i + " > " + Integer.MAX_VALUE);

        // числа с плавающей точкой со знаками после запятой
        double d = 0.1;
        System.out.println(Double.MIN_VALUE + " < " + d + " > " + Double.MAX_VALUE);

        // логический типа данных
        boolean b1 = true;
        boolean b2 = false;

        // символьный тип данных, 65000 вариантов хватает чтобы закодировать символ
        // в таблице юникод для каждый буквы/знака/символа указан соответствующий код
        char ch = 'a';
        System.out.println(Character.MIN_VALUE + " < " + ch + "  (" + (int) ch + ") < " + Character.MAX_VALUE);

        String s = "Hello world";
        System.out.println(s);
    }
}
