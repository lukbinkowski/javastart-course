package pl.javastart.library.app;

enum Option {

    EXIT(0,"wyjście z programu"),
    ADD_BOOK(1, "dodanie nowej ksiązki"),
    ADD_MAGAZINE(2, "dodanie nowego magaznu"),
    PRINT_BOOK(3, "wyświetl dostępne książki"),
    PRINT_MAGAZINE(4, "wyświetl dostępne magazyny");

    private final int value;
    private final String description;

    Option(int value, String description) {
        this.value = value;
        this.description = description;
    }

    static Option createFromInt(int option) {
        return Option.values()[option];
    }

    @Override
    public String toString() {
        return value + " - " + description;
    }
}
