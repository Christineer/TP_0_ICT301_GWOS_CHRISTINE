package ict301.solid.srp.apres;

/**
 * Classe BookPrinter
 * ✅ Responsabilité : présentation (affichage)
 */
public class BookPrinter {

    // Méthode pour afficher le livre à l'écran
    public void printToScreen(BookSRP book) {
        System.out.println("Titre: " + book.getTitle());
        System.out.println("Auteur: " + book.getAuthor());
        System.out.println("Contenu: " + book.getContent());
    }

    // On peut ajouter d'autres modes d'affichage sans modifier BookSRP
    public void printToHTML(BookSRP book) {
        System.out.println("<h1>" + book.getTitle() + "</h1>");
        System.out.println("<h2>Par " + book.getAuthor() + "</h2>");
        System.out.println("<p>" + book.getContent() + "</p>");
    }
}

