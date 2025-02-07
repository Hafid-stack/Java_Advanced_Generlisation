package Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MetierProduitImpl implements Metier<Produit>{
private long idd;
    Scanner sca=new Scanner(System.in);
ArrayList<Produit> pro=new ArrayList<>();
    @Override
    public void add(Produit o) {
        pro.add(o);
        System.out.println("Product added: "+o);
    }

    @Override
    public List<Produit> getAll() {
        return List.of();
    }

    @Override
    public Produit findById(long id) {
        System.out.println("Type ID");

        idd=sca.nextLong();
        sca.nextLine();
        for (Produit o : pro) {
            if (o.getId() == id) {
                return o;
            }

        }
        return null;
    }

    @Override
    public void delete(long id) {
        System.out.println("Type ID");
        sca.nextLong();
        sca.nextLine();
for (Produit o : pro) {
    if (o.getId() == id) {
        pro.remove(o);
    }else {
        System.out.println("Produit not found");
    }
}

    }

    public long getIdd() {
        return idd;
    }
}
