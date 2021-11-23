package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

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
