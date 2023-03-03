package pl.javastart.library.app;

import pl.javastart.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.6";
        System.out.println(appName);

        Book[] books = new Book[1000];
        books[0]= new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg", "9788373271890");
        books[1] = new Book("Java. Efektywne programowanie. Wydanie II", "Joshua Bloch", 2009, 352, "Helion",
                "9788324620845");
        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide", "Bert Bates, Katherine Sierra",
                2008, 851, "McGraw-Hill Osborne Media");
        //books[3] = new Book("Depp Work", "Cal Newport", 2016 ,304, "Grand Central Publishing","i1455586692");

        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        //books[3].printInfo();
        System.out.println("System może przechowywać do: " + books.length + " książek.");
    }
}
