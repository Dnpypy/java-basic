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
import java.util.Scanner;
/**
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class In {
    public static void main(String[] args) {
        // считывания значения с консоли
        var a = new Scanner(System.in).nextInt();
        System.out.println(a);

        var d = new Scanner(System.in).nextDouble();
        System.out.println(d);

        boolean f = new Scanner(System.in).nextBoolean();
        System.out.println(f);

        var ch = new Scanner(System.in).next().charAt(0);
        System.out.println(ch);

        var s = new Scanner(System.in).nextLine();
        System.out.println(s);
    }
}
