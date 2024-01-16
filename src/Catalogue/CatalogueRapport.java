package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.Rapport;

public class CatalogueRapport extends Catalogue {
    private List<Rapport> rapportCollection;

    public CatalogueRapport() {
        this.rapportCollection = new ArrayList<>();
    }

    public void ajouterRapport(Rapport rapport) {
        rapportCollection.add(rapport);
        super.ajouterDocument(rapport);
    }

    public void retirerRapport(Rapport rapport) {
        rapportCollection.remove(rapport);
        super.retirerDocument(rapport);
    }

    public Rapport rechercherRapportParTitre(String titre) {
        for (Rapport rapport : rapportCollection) {
            if (rapport.getTitre().equals(titre)) {
                return rapport;
            }
        }
        return null; // Retourne null si le rapport n'est pas trouvé.
    }

    public List<Rapport> getRapportCollection() {
        return rapportCollection;
    }
}
