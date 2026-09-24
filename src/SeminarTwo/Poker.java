package SeminarTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Poker {
    public static void poker(Scanner scanner){
        System.out.println("Введите количество игроков: ");
        int n = scanner.nextInt();
        String[] kardsrung = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};
        String[] suits = {"Пики", "Черви", "Бубны", "Трефы"};

        ArrayList<String> desk = new ArrayList<>();
        for(String suit : suits){
         for(String rungs : kardsrung){
            desk.add(rungs +" "+suit);
         }
        }
        Collections.shuffle(desk);
        if(n * 5 > desk.size()){
            System.out.println("Слишком много игроков!");
            return;
        }else{
            System.out.println("Началo раздачи: ");

        }
        int cardIndex = 0;
        for(int i =0;i <= n;i++){
            System.out.println("Игрок "+i+":");
            for(int j = 0; j<5;j++);
            System.out.println("  " + desk.get(cardIndex++));
        }
        System.out.println("==================");
       scanner.nextLine();
     }
}
