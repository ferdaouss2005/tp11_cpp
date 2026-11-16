
public class main {

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("978-2123456803", "Java Avancé", "Auteur A");

        // Ajouter un livre
        lib.addBookIndexed(b1);

        // Emprunter le livre
        lib.borrowBook(b1, "Alice");

        // Rechercher le livre par ISBN
        System.out.println("Livre trouvé par ISBN : "
                + lib.findByIsbn("978-2123456803"));

        // Essayer d'emprunter le même livre
        System.out.println("Deuxième emprunt : "
                + lib.borrowBook(b1, "Bob"));

        // Restituer le livre
        lib.returnBook(b1);

        // Emprunter à nouveau
        System.out.println("Nouvel emprunt : "
                + lib.borrowBook(b1, "Bob"));
    }
}
