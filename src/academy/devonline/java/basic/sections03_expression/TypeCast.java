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
 * @author devonline
 * @link http://devonline.academy/java-basic
 */
public class TypeCast {
    public static void main(String[] args) {
        int num = 1;
        char ch = '1';
        String s = "1";

        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf(ch);
        System.out.println(is);
        System.out.println(ds);
        System.out.println(bs);
        System.out.println(cs);

        System.out.println("Hello " + 1 + true + ch);

        // string - > int
        int it = Integer.parseInt("12");
        System.out.println(it);

        // string - > double
        double dd = Double.parseDouble("14");
        System.out.println(dd);

        // string - > boolean
        boolean bb = Boolean.parseBoolean("true");
        System.out.println(bb);

        // string - > char
        char cc = "a".charAt(0);
        char c2 = "dbc".charAt(0);
        System.out.println(cc);
        System.out.println(c2);
    }
}
