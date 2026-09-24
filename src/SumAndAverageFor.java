import java.util.Scanner;

public class SumAndAverageFor {
    public void sumAndAverageFor(Scanner scanner){
        System.out.println("Задача 3");
        int[] numbers = {10,20,30,40,50};
        System.out.println("Значения: " + java.util.Arrays.toString(numbers));
        int sum = 0;
        for (int i = 0; i< numbers.length; i++){
            sum += numbers[i];
        }
        double average = (double) sum/numbers.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
        numbers.clone();


    }

}
