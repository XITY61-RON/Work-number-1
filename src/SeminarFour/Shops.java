package SeminarFour;

import java.util.ArrayList;
import java.util.Scanner;

public class Shops {
    public static void main(String[] args){
        ArrayList<String> names  = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        names.add("Ноутбук");    prices.add(75000.0);
        names.add("Смартфон");   prices.add(45000.0);
        names.add("Наушники");   prices.add(5000.0);
        names.add("Книга Java"); prices.add(2500.0);
        names.add("Футболка");   prices.add(1500.0);

        ArrayList<String> cartNames  = new ArrayList<>();
        ArrayList<Double> cartPrices = new ArrayList<>();

        System.out.println("Добро пожаловать!\n Войдите в аккаунт что бы продолжить работу");
        Scanner paroll = new Scanner(System.in);

        System.out.println("Введите пароль");
        String inpyt = paroll.nextLine();
        System.out.println("Введите свое имя");
        String name = paroll.nextLine();
        if (!inpyt.equals("123")){
           System.out.println("Пароль введен не верно, повторите попытку");
           paroll.close();
           return;
        }
        if (!name.equals("Bovka")) {
            System.out.println("Имя введено не верно, повторите попытку");
           paroll.close();
           return;
        }
        System.out.println("Добро пожаловать в систему");
        while (true) {
            System.out.println("1. Список товаров");
            System.out.println("2. Добавить в корзину");
            System.out.println("3. Показать корзину");
            System.out.println("4. Купить");
            System.out.println("5. Выход");
            System.out.print("Выбор: ");
            int product = paroll.nextInt();

            switch (product) {
                case 1:
                    System.out.println("Товары");
                    for (int i = 0; i < names.size(); i++) {
                        System.out.println((i + 1) + ". " + names.get(i)
                                + " — " + prices.get(i) + " руб.");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Номер товара: ");
                    int num = paroll.nextInt() - 1;
                    if (num >= 0 && num < names.size()) {
                        cartNames.add(names.get(num));
                        cartPrices.add(prices.get(num));
                        System.out.println("Добавлено: " + names.get(num) + "\n");
                    } else {
                        System.out.println("Такого товара нет!\n");
                    }
                    break;

                case 3:
                    if (cartNames.isEmpty()) {
                        System.out.println("Корзина пуста.\n");
                    } else {
                        System.out.println("Корзина");
                        double total = 0;
                        for (int i = 0; i < cartNames.size(); i++) {
                            System.out.println(cartNames.get(i)
                                    + " — " + cartPrices.get(i) + " руб.");
                            total += cartPrices.get(i);
                        }
                        System.out.println("Итого: " + total + " руб.\n");
                    }
                    break;

                case 4:
                    if (cartNames.isEmpty()) {
                        System.out.println("Корзина пуста");
                    } else {
                        double total = 0;
                        for (double p : cartPrices) total += p;
                        System.out.println("Покупка на " + total + " руб. совершена. Спасибо!\n");
                        cartNames.clear();
                        cartPrices.clear();
                    }
                    break;

                case 5:
                    System.out.println("До свидания!");
                    paroll.close();
                    return;

                default:
                    System.out.println("Неверный пункт!\n");
            }
        }
    }
}

