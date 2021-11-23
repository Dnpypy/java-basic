package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        var name = new Scanner(System.in).nextLine();
        var hello = "Hello,";
        System.out.println(hello + " ${" + name + "}");
        System.out.println("Your username is ${name}");
    }
}
