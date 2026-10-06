package SeminarFour;

interface Printable {
    void print();
}
class Book implements Printable {
    private String title;
    public Book(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public void print() {
        System.out.println("Книга: " + title);
    }
}
class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public void print() {
        System.out.println("Журнал: " + title);
    }
    public static void printMagazines(Printable[] printable) {
        for (Printable p : printable) {
            if (p instanceof Magazine) {
                System.out.println(((Magazine) p).getTitle());
            }
        }
    }
}
public class Printtable {
    public static void main(String[] args) {
        Printable[] items = {
            new Book("Война и мир"),
            new Magazine("Forbes"),
            new Book("Преступление и наказание"),
            new Magazine("National Geographic"),
            new Magazine("Vogue")
        };
        System.out.println("Только журналы");
        Magazine.printMagazines(items);
    }
}

