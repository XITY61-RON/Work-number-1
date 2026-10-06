package SeminarFour;

import java.util.ArrayList;
import java.util.Scanner;
enum Brand {
    ASUS, ACER, LENOVO, HP, DELL, APPLE
}
class Processor {
    private String model;
    private double frequency;

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }
    @Override
    public String toString() {
        return model + " (" + frequency + " GHz)";
    }
}
class Memory {
    private int size;
    private String type;
    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }
    @Override
    public String toString() {
        return size + " GB " + type;
    }
}
class Monitor {
    private double diagonal;
    private String resolution;
    public Monitor(double diagonal, String resolution) {
        this.diagonal = diagonal;
        this.resolution = resolution;
    }
    @Override
    public String toString() {
        return diagonal + "\" " + resolution;
    }
}
class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private double price;
    public Computer(Brand brand, Processor processor, Memory memory,
                    Monitor monitor, double price) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
        this.price = price;
    }
    public Brand getBrand() { return brand; }
    public String getName() { return brand.name(); }
    public double getPrice() { return price; }
    @Override
    public String toString() {
        return brand + " | CPU: " + processor
                + " | RAM: " + memory
                + " | Monitor: " + monitor
                + " | " + price + " руб.";
    }
}
interface Inputable {
    Computer inputComputer(Scanner scanner);
}
class ComputerShop implements Inputable {
    private ArrayList<Computer> computers = new ArrayList<>();
    public void addComputer(Computer c) {
        computers.add(c);
    }
    public void removeComputer(String brandName) {
        computers.removeIf(c -> c.getName().equalsIgnoreCase(brandName));
    }
    public Computer findComputer(String brandName) {
        for (Computer c : computers) {
            if (c.getName().equalsIgnoreCase(brandName)) return c;
        }
        return null;
    }
    public void printAll() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст.");
            return;
        }
        for (Computer c : computers) {
            System.out.println(c);
        }
    }
    @Override
    public Computer inputComputer(Scanner scanner) {
        System.out.print("Марка (" + java.util.Arrays.toString(Brand.values()) + "): ");
        String brandStr = scanner.nextLine().trim().toUpperCase();
        Brand brand;
        try {
            brand = Brand.valueOf(brandStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Нет такой марки!");
            return null;
        }
        System.out.print("Модель процессора: ");
        String cpuModel = scanner.nextLine().trim();
        System.out.print("Частота процессора (ГГц): ");
        double freq = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Объём памяти (ГБ): ");
        int ramSize = Integer.parseInt(scanner.nextLine().trim());
        System.out.print("Тип памяти (DDR4/DDR5): ");
        String ramType = scanner.nextLine().trim();
        System.out.print("Диагональ монитора (дюймы): ");
        double diag = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Разрешение монитора: ");
        String res = scanner.nextLine().trim();
        System.out.print("Цена (руб.): ");
        double price = Double.parseDouble(scanner.nextLine().trim());
        return new Computer(
                brand,
                new Processor(cpuModel, freq),
                new Memory(ramSize, ramType),
                new Monitor(diag, res),
                price
        );
    }
    public static void shop(Scanner scanner) {
        ComputerShop shop = new ComputerShop();
        while (true) {
            System.out.println("\nИнтернет-магазин компьютерной техники");
            System.out.println("1. Добавить компьютер");
            System.out.println("2. Найти компьютер по марке");
            System.out.println("3. Удалить компьютер по марке");
            System.out.println("4. Показать все компьютеры");
            System.out.println("5. Выход");
            System.out.print("Выбор: ");
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    Computer c = shop.inputComputer(scanner);
                    if (c != null) {
                        shop.addComputer(c);
                        System.out.println("Компьютер добавлен!");
                    }
                    break;
                case "2":
                    System.out.print("Введите марку для поиска: ");
                    String search = scanner.nextLine().trim();
                    Computer found = shop.findComputer(search);
                    System.out.println(found != null
                            ? "Найден: " + found
                            : "Компьютер марки " + search + " не найден.");
                    break;
                case "3":
                    System.out.print("Введите марку для удаления: ");
                    String del = scanner.nextLine().trim();
                    shop.removeComputer(del);
                    System.out.println("Оставшиеся компьютеры:");
                    shop.printAll();
                    break;
                case "4":
                    shop.printAll();
                    break;
                case "5":
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Неверный пункт!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ComputerShop.shop(scanner);
        scanner.close();
    }
}