package SeminarThree;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class StrFormTask {
    public static void strFormTask(Scanner scanner){
        Scanner money = new Scanner(System.in);
        System.out.println("Введите сумму(руб.): ");
        double rub = money.nextDouble();

        double usdRate = 90.0;
        double eurRate = 100.0;
        double cnyRate = 13.5;

        double usd = rub/usdRate;
        double eur = rub/eurRate;
        double cny = rub/cnyRate;

        NumberFormat usdFmt = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat eurFmt = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat cnyFmt = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat rubFmt = NumberFormat.getCurrencyInstance(Locale.of("ru", "RU"));

        System.out.println("Результат конвертации");
        System.out.println("В рублях: " + rubFmt.format(rub));
        System.out.printf("В долларах (USD): %s%n", usdFmt.format(usd));
        System.out.printf("В евро (EUR):     %s%n", eurFmt.format(eur));
        System.out.printf("В юанях (CNY):    %s%n", cnyFmt.format(cny));

        money.close();


    }

}
