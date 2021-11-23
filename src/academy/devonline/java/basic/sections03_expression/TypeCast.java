package academy.devonline.java.basic.sections03_expression;

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
