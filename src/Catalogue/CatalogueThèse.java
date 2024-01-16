package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.Thèse;

public class CatalogueThèse extends Catalogue {
    private List<Thèse> thèseCollection;

    public CatalogueThèse() {
        this.thèseCollection = new ArrayList<>();
    }

    public void ajouterThèse(Thèse thèse) {
        thèseCollection.add(thèse);
        super.ajouterDocument(thèse);
    }

    public void retirerThèse(Thèse thèse) {
        thèseCollection.remove(thèse);
        super.retirerDocument(thèse);
    }

    public Thèse rechercherThèseParTitre(String titre) {
        for (Thèse thèse : thèseCollection) {
            if (thèse.getTitre().equals(titre)) {
                return thèse;
            }
        }
        return null; // Retourne null si la thèse n'est pas trouvée.
    }

    public List<Thèse> getThèseCollection() {
        return thèseCollection;
    }
}
