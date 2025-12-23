package ict301.solid.srp.apres;

/**
 * Classe BookSaver
 * ✅ Responsabilité : persistance
 */
public class BookSaver {

    // Sauvegarde en base de données
    public void saveToDatabase(BookSRP book) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' en base de données...");
    }

    // Autre type de sauvegarde possible
    public void saveToFile(BookSRP book, String filename) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' dans le fichier " + filename);
    }
}

