package academy.devonline.java.basic.section02_structure;

import java.io.File;

public class MkDir {
    public static void main(String[] args) {
        new File(args[0]).mkdir();
    }
}
