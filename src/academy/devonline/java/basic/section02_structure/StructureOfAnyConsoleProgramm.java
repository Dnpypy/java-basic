package academy.devonline.java.basic.section02_structure;

import java.util.Scanner;

public class StructureOfAnyConsoleProgramm {
    public static void main(String[] args) {

        // read source data
        System.out.println("Please enter the number: ");
        var i = new Scanner(System.in).nextInt();

        // proccesing
        var j = i + 1;

        // display result
        System.out.println(j);
    }
}
