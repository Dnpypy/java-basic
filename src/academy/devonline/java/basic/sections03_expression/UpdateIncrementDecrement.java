package academy.devonline.java.basic.sections03_expression;
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

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class UpdateIncrementDecrement {
    public static void main(String[] args) {
        var a = 0;
        System.out.println(a);

        a = 5;
        System.out.println(a);

        a = a + 3;
        System.out.println(a);

        a += 3; // a += 1
        System.out.println(a);

        a ++; // a += 1 +> a = a + 1;
        System.out.println(a);

        a --; // a -= 1 -> a = a - 1;
        System.out.println(a);

        a *= 2;
        a = a * 2;
        System.out.println(a);

        a /= 3;
        a = a / 3;
        System.out.println(a);

    }
}
