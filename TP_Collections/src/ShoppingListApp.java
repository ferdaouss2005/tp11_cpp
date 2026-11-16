
import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {

    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();

        // Ajouter des articles
        shoppingList.add("Pommes");
        shoppingList.add("Lait");
        shoppingList.add("Pain");

        // Afficher la liste
        System.out.println("Articles de la liste :");

        for (String item : shoppingList) {
            System.out.println("- " + item);
        }

        // Supprimer un article
        shoppingList.remove("Lait");

        // Vérifier la présence d'un article
        boolean hasApples = shoppingList.contains("Pommes");

        System.out.println("Contient des pommes ? " + hasApples);

        // Afficher la taille finale
        System.out.println("Taille finale de la liste : " + shoppingList.size());
    }
}
