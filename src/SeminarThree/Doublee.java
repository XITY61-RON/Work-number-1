package SeminarThree;

import java.util.Scanner;

public class Doublee {
    public static void doublee(Scanner scanner) {
        Double d1 = Double.valueOf(3.14);          
        Double d2 = Double.valueOf("2.71828");    
        Double d3 = Double.valueOf(100);          
        System.out.println("1. Объекты Double через valueOf()");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        String str = "42.195";
        double parsed = Double.parseDouble(str);
        System.out.println("2. Double.parseDouble()");
        System.out.println("Строка:        " + str);
        System.out.println("double parsed: " + parsed);
        System.out.println("Тип результата: " + ((Object) parsed).getClass().getName());
        Double obj = Double.valueOf(65.987);
        System.out.println("3. Преобразование Double ко всем примитивным типам");
        byte    b  = obj.byteValue();      
        short   s  = obj.shortValue();     
        int     i  = obj.intValue();       
        long    l  = obj.longValue();      
        float   f  = obj.floatValue();     
        double  d  = obj.doubleValue();    
        System.out.println("Оригинал (double): " + obj);
        System.out.println("byteValue()   = " + b);
        System.out.println("shortValue()  = " + s);
        System.out.println("intValue()    = " + i);
        System.out.println("longValue()   = " + l);
        System.out.println("floatValue()  = " + f);
        System.out.println("doubleValue() = " + d);
        boolean bool = obj != 0;
        System.out.println("Ручное преобразование к boolean (obj != 0) = " + bool);
        char c = (char) obj.intValue();
        System.out.println("Ручное преобразование к char (код символа) = " + c);
        System.out.println("4. Вывод объекта Double на консоль");
        System.out.println("println(obj)          -> " + obj);
        System.out.println("println(obj.toString())-> " + obj.toString());
        System.out.printf("printf(%%.2f)          -> %.2f%n", obj);
        System.out.printf("printf(%%.4f)          -> %.4f%n", obj);
        String dStr = Double.toString(3.14);
        System.out.println("5. Double.toString(3.14)");
        System.out.println("Результат: \"" + dStr + "\"");
        System.out.println("Длина строки: " + dStr.length());
        System.out.println("Тип результата: " + dStr.getClass().getName());
    }
}


