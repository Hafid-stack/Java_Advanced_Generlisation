package Play;

import Generic.Menu;
import Generic.MetierProduitImpl;
import Generic.Produit;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        MetierProduitImpl mtp = new MetierProduitImpl();

        // Add some initial products
        mtp.add(new Produit(1L, "Laptop", "Dell", 1200, "Gaming Laptop", 5));
        mtp.add(new Produit(2L, "Smartphone", "Samsung", 800, "Android Phone", 10));
        mtp.add(new Produit(3L, "Tablet", "Apple", 900, "iPad Pro", 7));
        mtp.add(new Produit(4L, "Smartwatch", "Garmin", 300, "Fitness Tracker", 15));
        mtp.add(new Produit(5L, "Headphones", "Sony", 250, "Noise Cancelling", 12));
        mtp.add(new Produit(6L, "Gaming Console", "Sony", 500, "PlayStation 5", 8));
        mtp.add(new Produit(7L, "Camera", "Canon", 1100, "Professional DSLR", 4));
        mtp.add(new Produit(8L, "Printer", "HP", 200, "Wireless Printer", 9));
        mtp.add(new Produit(9L, "Monitor", "LG", 350, "4K UHD Display", 6));

        int choice;

        do {
            choice = Menu.getOption();

            switch (choice) {
                case 1:
                    List<Produit> produits = mtp.getAll();
                    for (Produit produit : produits) {
                        System.out.println(produit);
                    }
                    break;
                case 2:
                    Produit produitFound = mtp.findById(mtp.getIdFromUser());
                    if (produitFound != null) {
                        System.out.println("Product Found: " + produitFound);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    long idToDelete = mtp.getIdFromUser();
                    mtp.delete(idToDelete);
                    break;
                case 4:
                    System.out.println("Exiting Program.");
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }

        } while (choice != 4);
    }
}