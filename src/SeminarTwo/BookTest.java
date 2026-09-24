package SeminarTwo;
import java.util.Arrays;
import java.util.Scanner;

class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public int getYear() { return year; }

    @Override
    public String toString() {
        return "\"" + title + "\" (" + author + ", " + year + ")";
    }
}

class BookShelf {
    private Book[] books;
    private int count = 0;

    public BookShelf(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        }
    }

    public Book getLatest() {
        Book latest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() > latest.getYear()) latest = books[i];
        }
        return latest;
    }

    public Book getEarliest() {
        Book earliest = books[0];
        for (int i = 1; i < count; i++) {
            if (books[i].getYear() < earliest.getYear()) earliest = books[i];
        }
        return earliest;
    }

    public void sortByYear() {
        Arrays.sort(books, 0, count, (b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));
    }

    public void printBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}

public class BookTest {
    public static void books(Scanner scanner) {
        BookShelf shelf = new BookShelf(5);
        shelf.addBook(new Book("Пушкин", "Евгений Онегин", 1833));
        shelf.addBook(new Book("Толстой", "Война и мир", 1869));
        shelf.addBook(new Book("Булгаков", "Мастер и Маргарита", 1967));

        System.out.println("Самая поздняя: " + shelf.getLatest());
        System.out.println("Самая ранняя: " + shelf.getEarliest());
        
        shelf.sortByYear();
        System.out.println("\nОтсортированные книги:");
        shelf.printBooks();
    }
}
