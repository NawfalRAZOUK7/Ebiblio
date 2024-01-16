package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.Journal;

public class CatalogueJournal extends Catalogue {
    private List<Journal> journalCollection;

    public CatalogueJournal() {
        this.journalCollection = new ArrayList<>();
    }

    public void ajouterJournal(Journal journal) {
        journalCollection.add(journal);
        super.ajouterDocument(journal);
    }

    public void retirerJournal(Journal journal) {
        journalCollection.remove(journal);
        super.retirerDocument(journal);
    }

    public Journal rechercherJournalParTitre(String titre) {
        for (Journal journal : journalCollection) {
            if (journal.getTitre().equals(titre)) {
                return journal;
            }
        }
        return null; // Retourne null si le journal n'est pas trouvé.
    }

    public List<Journal> getJournalCollection() {
        return journalCollection;
    }
}
