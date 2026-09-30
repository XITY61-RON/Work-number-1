package SeminarThree;

import java.util.Random;
import java.util.Scanner;

public class MaxAndMin {
    public static void maxAndMin(Scanner scanner){
        int[] arr = new int[4];
        Random random = new Random();

        for(int i = 0; i< arr.length;i++){
            arr[i] = 10+ random.nextInt(90);
        }
        System.out.println("Maccив: ");
        for(int v : arr) System.out.println(v+ "");{
            System.out.println(" ");
        }
        boolean strick  = true;
        for(int i = 1; i < arr[i-1];i++){
            if(arr[i] <= arr[i-1]){
                strick = false;
                break;
            }
        }
        if (strick) {
            System.out.println("Является строго возрастающей");
        }else{
            System.out.println("Не является строго возрастающей");
        }
    }



}
