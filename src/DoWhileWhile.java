import java.util.Scanner;

public class DoWhileWhile {
    public static void DoWhiLeWhile(Scanner scanner){
        System.out.println("Введите размер: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы: ");
        for (int i = 0; i<size;i++){
            arr[i] = scanner.nextInt();
        }
    int sumDoWhile = 0;
    int i = 0;
    do{
        sumDoWhile += arr[i];
        i++;
    }while(i < arr.length);
    System.out.println("Summ: " + sumDoWhile);
    int sumWhile = 0;
    int j = 0;
    while (j < arr.length){
        sumWhile += arr[j];
        j++;
    }
    int max = arr[0];
    int min = arr[0];
    for(int k = 1; k < arr.length; k++){
        if(arr[k] > max) max = arr[k];
        if(arr[k] < min) max = arr[k];
    }
    System.out.println("Числа: " + sumWhile);

    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
    


    }
   
}


