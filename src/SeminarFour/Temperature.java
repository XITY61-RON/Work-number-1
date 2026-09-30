package SeminarFour;

import java.util.Scanner;

interface Convertable {
    double convert();
}

class Celsius implements Convertable {
    double value;

    Celsius(double value) {
        this.value = value;
    }

    @Override
    public double convert() {
        return value * 9 / 5 + 32;   // в Фаренгейт
    }
}

public class Temperature { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Цельсий: ");
        double c = scanner.nextDouble();

        Celsius celsius = new Celsius(c);

        System.out.println("Фаренгейт: " + celsius.convert());
        System.out.println("Кельвин:   " + (c + 273.15));
        scanner.close();
    }
}

