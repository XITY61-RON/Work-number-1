package SeminarTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class DogKennel {
 private ArrayList<Dogee> dogs = new ArrayList<>();
 public void addDog(Dogee c){
    dogs.add(c);
 }
 public void removeDog(String dogName){
    dogs.removeIf(c -> c.getDogName().equalsIgnoreCase(dogName));
 }
 public void printAll(){
    for(Dogee c : dogs){
        System.out.println(c);
    }
 }
 public static void dog(Scanner scanner){
    DogKennel dog = new DogKennel();
    while (true) {
        System.out.println("Что вы хотите сделать?");
        System.out.println("Введите 1 - добавить собаку");
        System.out.println("Введите 2 - собака в новом доме");
        System.out.println("Выйти нажмите 3");
        String dogs = scanner.nextLine();
        switch (dogs) {
            case "1":
                System.out.print("Сколько собак добавить? ");
                int number = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < number; i++) {
                System.out.print("Имя: ");
                String dogName = scanner.nextLine();
                System.out.print("Возраст: ");
                double ageDog = scanner.nextDouble();
                scanner.nextLine();
                Dogee newDog = new Dogee(dogName, ageDog);
                dog.addDog(newDog);
                System.out.println(newDog);
                }
                break;
            case "2":
                System.out.print("Кличка для удаления: ");
                String toRemove = scanner.nextLine();
                dog.removeDog(toRemove);
                break;
            case "3":
                System.out.println("До свидания!");
                return;
            default:
                System.out.println("Неверный ввод");
                break;
        }
    }
 }
}

class Dogee{
    private String dogName;
    private double ageDog;
public Dogee(String dogName, double ageDog){
    this.dogName = dogName;
    this.ageDog = ageDog;

}
public String getDogName(){return dogName;}
public double getAgeDog(){return ageDog;}
public double humAgeDog(){return ageDog * 7;}
@Override 
public String toString(){
return "Name: " + dogName +"|"+"Age: " + ageDog +"|"+"Human age: " + humAgeDog();
}

}