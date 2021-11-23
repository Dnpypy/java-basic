package academy.devonline.java.basic.section02_structure;

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
