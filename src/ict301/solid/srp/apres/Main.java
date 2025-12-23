package ict301.solid.srp.apres;

public class Main {
    public static void main(String[] args) {

        BookSRP book = new BookSRP(
                "Les principes SOLID",
                "Etudiants de M1 GL",
                "Révision des principes SOLID"
        );

        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic logic = new BookBusinessLogic();

        printer.printToScreen(book);
        saver.saveToDatabase(book);
        logic.emprunter(book, "Marcial");
    }
}
