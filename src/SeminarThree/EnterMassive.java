package SeminarThree;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EnterMassive {
    public static void enterMassive(Scanner scanner){
        Scanner enter = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("Введите массив: ");
            if(enter.hasNextInt()){
                n = enter.nextInt();
                if(n>0)
                    break;
                System.out.println("N<0");
            }else {
                System.out.println("Нужно целое число!");
                enter.next();
            }            
        }
        System.out.println("Введен корректный размер");
        int[] arr = new int[n];
        Random random = new Random();
        for(int i = 0; i<n;i++){
            arr[i] = random.nextInt(n+1);
        }
        int[] even = Arrays.stream(arr).filter(x-> x%2==0).toArray();
        System.out.println("Исходный: " + Arrays.toString(arr));
        System.out.println("Чётные:   " + Arrays.toString(even));
        enter.close();

    }

}
