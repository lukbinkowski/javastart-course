package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.Magazine;


import java.util.Scanner;

public class DataReader {

    Scanner sc = new Scanner(System.in);

    public Book readAndCreateBook() {
        System.out.println("Tytuł:");
        String title = sc.nextLine();
        System.out.println("Autor:");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo:");
        String publisher = sc.nextLine();
        System.out.println("ISBN:");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania:");
        int relaseDate = sc.nextInt();
        System.out.println("Liczba stron:");
        int pages = sc.nextInt();
        return new Book(title, author, relaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł:");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo:");
        String publisher = sc.nextLine();
        System.out.println("język:");
        String language = sc.nextLine();
        System.out.println("Rok wydania:");
        int year = sc.nextInt();
        System.out.println("Miesiąc");
        int month = sc.nextInt();
        System.out.println("Dzień");
        int day = sc.nextInt();
        return new Magazine(title, publisher, year, language, month, day);
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public void close() {
        sc.close();
    }
}
