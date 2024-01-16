package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.PartitionMusicale;

public class CataloguePartitionMusicale extends Catalogue {
    private List<PartitionMusicale> partitionMusicaleCollection;

    public CataloguePartitionMusicale() {
        this.partitionMusicaleCollection = new ArrayList<>();
    }

    public void ajouterPartitionMusicale(PartitionMusicale partitionMusicale) {
        partitionMusicaleCollection.add(partitionMusicale);
        super.ajouterDocument(partitionMusicale);
    }

    public void retirerPartitionMusicale(PartitionMusicale partitionMusicale) {
        partitionMusicaleCollection.remove(partitionMusicale);
        super.retirerDocument(partitionMusicale);
    }

    public PartitionMusicale rechercherPartitionMusicaleParTitre(String titre) {
        for (PartitionMusicale partitionMusicale : partitionMusicaleCollection) {
            if (partitionMusicale.getTitre().equals(titre)) {
                return partitionMusicale;
            }
        }
        return null; // Retourne null si la partition musicale n'est pas trouvée.
    }

    public List<PartitionMusicale> getPartitionMusicaleCollection() {
        return partitionMusicaleCollection;
    }
}
