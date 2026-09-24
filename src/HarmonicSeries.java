import java.util.Scanner;

public class HarmonicSeries {
    public static void HarmOnicSeries(Scanner scanner){
        System.out.println("Первые 10 чисел гармонического ряда : ");
        double sum = 0;
        for(int i = 0; i<= 10; i++){
            double term = 1.0/i;
            sum += term;
            System.out.printf("1/%d = %.4f(Сумма: %.4f)%n",i,term,sum);
        }
    }

}
