import java.util.Scanner;

public class Factorial {
    public static long factorialcalc(int n){
        if (n < 0) 
        return -1;
    long result = 1;
    for(int i = 1; i <=n;i++){
        result *= i;
    }
    return result;
            
    
    }
    public static void factorial(Scanner scanner){
        int number = 5;
        long fact = factorialcalc(number);
        System.out.println("Факториал числа: " + number + "=" + fact);
    }

}
