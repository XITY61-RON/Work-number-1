package SeminarFour;

import java.util.Scanner;

interface StringOperations {
    int countChars(String s);         
    String oddPositions(String s);     
    String reverse(String s);          
}
class StringImpl implements StringOperations {
    @Override
    public int countChars(String s) {
        return s.length();
    }
    @Override
    public String oddPositions(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }
    @Override
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
public class StringWorlds {
    public static void main(String[] args) {
        Scanner strings = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = strings.nextLine();
        StringOperations ops = new StringImpl();
        System.out.println("Результат");
        System.out.println("Длина строки:            " + ops.countChars(s));
        System.out.println("Символы на нечётных поз: " + ops.oddPositions(s));
        System.out.println("Инвертированная строка:  " + ops.reverse(s));

        strings.close();
    }
}