package ict301.solid.srp.apres;

/**
 * Classe BookBusinessLogic
 * ✅ Responsabilité : logique métier
 */
public class BookBusinessLogic {

    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("Emprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }

    // Autre logique métier possible
    public void autreService(BookSRP book) {
        System.out.println("Autre service métier sur le livre '" + book.getTitle() + "'");
    }
}
