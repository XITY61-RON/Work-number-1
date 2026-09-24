package SeminarTwo;

import java.util.Scanner;

public class HowMany {
    public static void howMany(Scanner scanner){
        System.out.println("Введите предложения и нажмите Enter");
        String input = scanner.nextLine();

        if(input.trim().isEmpty()){
            System.out.println("Вы ввели слов: 0");
        }else{
            String[] words = input.trim().split("\\s+");
            System.out.println("Вы ввели слов: " + words.length);
        }
    }

}
