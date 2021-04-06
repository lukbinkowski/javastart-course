public class Book {
    String title;
    String author;
    int releaseDate;
    int pages;
    String Publisher;
    String isbn;

    Book(String bookTitle, String bookAuthor, int bookReleaseD, int bookPages, String bookPublisher, String bookIsbn) {
        title = bookTitle;
        author = bookAuthor;
        releaseDate = bookReleaseD;
        pages = bookPages;
        Publisher = bookPublisher;
        isbn = bookIsbn;
    }


    void printInfo() {
        String info = title + "; " + author + "; " + releaseDate + "; " + pages + "; " + Publisher + "; " + isbn;
        System.out.println(info);
    }
}
