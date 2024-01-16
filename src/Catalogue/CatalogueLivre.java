package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.Livre;

public class CatalogueLivre extends Catalogue {
    private List<Livre> livreCollection;

    public CatalogueLivre() {
        this.livreCollection = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livreCollection.add(livre);
        super.ajouterDocument(livre);
    }

    public void retirerLivre(Livre livre) {
        livreCollection.remove(livre);
        super.retirerDocument(livre);
    }

    public Livre rechercherLivreParTitre(String titre) {
        for (Livre livre : livreCollection) {
            if (livre.getTitre().equals(titre)) {
                return livre;
            }
        }
        return null; // Retourne null si le livre n'est pas trouvé.
    }

    public List<Livre> getLivreCollection() {
        return livreCollection;
    }
}
