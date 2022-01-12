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

package academy.devonline.java.basic.section11_decomposition;

import java.util.*;

/**
 * @author Dnpypy
 * @link http://devonline.academy/java-basic
 */
public class HomeStringArrayTrimRegex {
    public static void main(String[] args) {
        //// read source data
        //String text = "hello,java-world\tjava    hello: I? Hello! Java World. java";
        //String text = "hello java world java hello I Hello Java World java i i i I I i i";
//String text = "hello,java-world\tjava hello: I? Hello! Java World. java-hello-java/world=world:world";
//String text = "hello,java-world\tjava    hello: I? Hello! Java World. java";
//String text = "hello java world java hello I Hello Java World java Hello java";
String text = "hello java world java hello I Hello Java World java Hello java I I I I I I I";

        //processing
        String[] temp = text.replaceAll("[^a-zA-Z]", " ").split("\\s+");

//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < text.length(); i++) {
//            var ch = text.charAt(i);
//            if (Character.isLetter(ch)) {
//                sb.append(ch);
//            } else if(Character.isWhitespace(ch)){
//                sb.append("");
//            } else {
//                sb.append(" ");
//            }
//        }
//        String text2 = sb.toString();
//        System.out.println(text2);
//
//        String[] temp = text2.trim().split(" ");
//        System.out.println(Arrays.toString(temp));

        // display results
        System.out.println(Arrays.toString(temp));
    }
}
