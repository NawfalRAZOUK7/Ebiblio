package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.Magazine;

public class CatalogueMagazine extends Catalogue {
    private List<Magazine> magazineCollection;

    public CatalogueMagazine() {
        this.magazineCollection = new ArrayList<>();
    }

    public void ajouterMagazine(Magazine magazine) {
        magazineCollection.add(magazine);
        super.ajouterDocument(magazine);
    }

    public void retirerMagazine(Magazine magazine) {
        magazineCollection.remove(magazine);
        super.retirerDocument(magazine);
    }

    public Magazine rechercherMagazineParTitre(String titre) {
        for (Magazine magazine : magazineCollection) {
            if (magazine.getTitre().equals(titre)) {
                return magazine;
            }
        }
        return null; // Retourne null si le magazine n'est pas trouvé.
    }

    public List<Magazine> getMagazineCollection() {
        return magazineCollection;
    }
}
