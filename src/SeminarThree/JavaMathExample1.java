package SeminarThree;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class JavaMathExample1 {
    public static void javaMathExample1(Scanner scanner){
        int n = 10;
        System.out.println("Размер массива равен: " + n);

        double[] arr1 = new double[n];
        for(int i =0;i<n;i++){
            arr1[i] = Math.random() * 100; 
        }
        System.out.println(" Math ");
        System.out.println("До сортировки: "+ Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("После: "+Arrays.toString(arr1));

        Random random = new Random();
         double[] arr2 = new double[n];
        for(int j = 0; j < n;j++){
            arr2[j] = random.nextDouble()*100;
        }
        System.out.println(" Random ");
        System.out.println("До сортировки: "+ Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("После: "+Arrays.toString(arr2));
    }

}
