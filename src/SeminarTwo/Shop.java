package SeminarTwo;
import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
private ArrayList<Computer> computers = new ArrayList<>();
public  void addComputer(Computer c){
    computers.add(c);
}
public void removeComputer(String name){
    computers.removeIf(c -> c.getName().equalsIgnoreCase(name));
}
public Computer findComputer(String name){
    for(Computer c : computers){
        if(c.getName().equalsIgnoreCase(name)) return c;
    }
    return null;
}
public void printAll() {
        for (Computer c : computers) {
            System.out.println(c);
        }
    }
public static void shop(Scanner scanner){
    Shop shop = new Shop();
    while (true) {
        System.out.println("Сколько нужно компьютеров?");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Что вы хотите сделать?");
        System.out.println("Введите 1 - добавить товар");
        System.out.println("Введите 2 - найти потерю");
        System.out.println("Введите 3 - удалить товар");
        System.out.println("Выйти нажмите 4");
        String shops = scanner.nextLine();
        switch (shops) {
            case "1":
                for(int i = 0; i < number; i++){
                System.out.println("Введите название и цену через пробел");
                String name = scanner.next();
                double price = scanner.nextDouble();
                scanner.nextLine();
                shop.addComputer(new Computer(name, price));
                }
                break;
            case"2":
            System.out.println("Введите название для поиска: ");
            String searchName = scanner.next();
            Computer found = shop.findComputer(searchName);
            System.out.println(found != null? "Найден: " + found : "Не найден");
            break;
            case "3":
                System.out.println("Введите название для удаления");
                String delit = scanner.nextLine();
                shop.removeComputer(delit);
                System.out.println("Оставшиеся");
                shop.printAll();
                break;
            case "4":
                System.out.println("Enter to leav");
                scanner.close();
                return ;

            default:
                break;
        }
        
    }
    
}
}
class Computer {
    private String name;
    private double price;
public Computer(String name, double price){
    this.name = name;
    this.price = price;
}
public String getName(){return name;}
public double getPrice(){return price;}

@Override 
public String toString(){
    return name + "(" + price + " Rub.)";

}
}

