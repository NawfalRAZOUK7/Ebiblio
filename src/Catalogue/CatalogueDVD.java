package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.DVD;

public class CatalogueDVD extends Catalogue {
    private List<DVD> dvdCollection;

    public CatalogueDVD() {
        this.dvdCollection = new ArrayList<>();
    }

    public void ajouterDVD(DVD dvd) {
        dvdCollection.add(dvd);
        super.ajouterDocument(dvd);
    }

    public void retirerDVD(DVD dvd) {
        dvdCollection.remove(dvd);
        super.retirerDocument(dvd);
    }

    public DVD rechercherDVDParTitre(String titre) {
        for (DVD dvd : dvdCollection) {
            if (dvd.getTitre().equals(titre)) {
                return dvd;
            }
        }
        return null; // Retourne null si le DVD n'est pas trouvé.
    }

    public List<DVD> getDVDCollection() {
        return dvdCollection;
    }
}
