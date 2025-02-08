package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetierProduitImpl implements Metier<Produit> {
    private List<Produit> produits = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add(Produit o) {
        produits.add(o);
        System.out.println("Product added: " + o);
    }

    @Override
    public List<Produit> getAll() {
        return new ArrayList<>(produits); // Return a copy to avoid modifying the original list
    }

    @Override
    public Produit findById(long id) {
        for (Produit produit : produits) {
            if (produit.getId() == id) {
                return produit;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {
        produits.removeIf(produit -> produit.getId() == id);
        // Use removeIf for more concise deletion
    }

    // Helper method to get user input for ID
    public long getIdFromUser() {
        System.out.print("Enter ID: ");
        return scanner.nextLong();
    }
}