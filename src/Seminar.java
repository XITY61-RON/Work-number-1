import java.util.Scanner;

import SeminarThree.JavaMathExample1;
import SeminarThree.PointCircleTester;
import SeminarTwo.WorkNumberTwo;
import SeminarTwo.Ball;
import SeminarTwo.BookTest;
import SeminarTwo.DogKennel;
import SeminarTwo.HowMany;
import SeminarTwo.Poker;
import SeminarTwo.Shop;
import SeminarTwo.Tester;
public class Seminar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Какое задание вы хотите выполнить?");
        while (true) {
            System.out.println("Блок 1");
            System.out.println("=======================");
            System.out.println("Практика 1");
            System.out.println("3 Задание");
            System.out.println("4 Задание");
            System.out.println("5 Задание");
            System.out.println("6 Задание");
            System.out.println("7 Задание");
            System.out.println("=======================");
            System.out.println("Практика 2");
            System.out.println("8 Задание" );
            System.out.println("9 Задание" );
            System.out.println("10 Задание" );
            System.out.println("11 Задание" );
            System.out.println("12 Задание" );
            System.out.println("13 Задание" );
            System.out.println("14 Задание" );
            System.out.println("15 Задание" );
            System.out.println("16 Задание" );
            System.out.println("17 Задание" );
            System.out.println("=======================");
            System.out.println("Практика 3");
            System.out.println("18 Задание" );
            System.out.println("19 Задание" );
            System.out.println("20 Задание" );
            System.out.println("21 Задание" );
            System.out.println("22 Задание" );
            System.out.println("23 Задание" );
            System.out.println("60 Выход");



            String paragraph = scan.nextLine();
        switch (paragraph) {
            case "3":
                System.out.println("Ответ: ");
                SumAndAverageFor task3 = new SumAndAverageFor();
                task3.sumAndAverageFor(scan);
                break;
            case "4":
                System.out.println("Ответ: ");
                DoWhileWhile task4 = new DoWhileWhile();
                task4.DoWhiLeWhile(scan);
                break;
            case "5":
                System.out.println("Ответ аргумента комендной строки: ");
                args = new String[]{"123","Hello","World"};
                for(int i = 0; i <args.length; i++){
                    System.out.println("Аргумент: " + i + " : " + args[i]);
                }
                 System.out.println("Нажмите Enter для выхода из просмотра");
                    scan.nextLine();
                
                break;
            case "6":
                System.out.println("Ответ: ");
                HarmonicSeries task6 = new HarmonicSeries();
                task6.HarmOnicSeries(scan);
                break;
            case "7":
                System.out.println("Ответ: ");
                Factorial task7 = new Factorial();
                task7.factorial(scan);
                break; 
            case "8":
                WorkNumberTwo task8 = new WorkNumberTwo();
                task8.taskAuthor();
                break;
            case "9":
                Ball.test(scan);
                break;
            case "10":
               Tester.tester(scan);
                break;
            case "11":
                Shop.shop(scan);
                break;
            case "12":
                DogKennel.dog(scan);
                break;
            case "13":
                // SeminarTwo.Circle n = new SeminarTwo.Circle();
                // SeminarTwo.Circle.main(new String[0]);
                // System.out.println("Нажмите Enter для возврата в меню");
                // scan.nextLine();
     
              break;
            case "14":
                BookTest.books(scan);
                break;
            case "15":
                 String[] array = {"a", "b", "c", "d", "e"};
                for (int i = 0; i < array.length / 2; i++) {
                String temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }

            System.out.println("Перевернутый массив:");
            for (String s : array) {
            System.out.print(s + " ");
        }
                break;
            case "16":
                Poker.poker(scan);
                scan.nextLine();
                break;
            case "17":
                HowMany.howMany(scan);
                scan.nextLine();
                break;
            case "18":
                JavaMathExample1.javaMathExample1(scan);
                scan.nextLine();
                break;
            case "19":
                PointCircleTester.pointCircleTester(scan);
                scan.nextLine();
                break;
            case "20":
                break;
            case "21":
                break;
            case "22":
                break;
            case "60":
                System.out.println("Выход");
                scan.close();
                break;        
            default:
                System.out.println("Задания НАЧИНАЮТСЯ C 3!!!");
                scan.nextLine();
                break;
        }
        }
        
    }
}
