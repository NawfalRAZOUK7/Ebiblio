package GestionEmprunt;

import Emprunt.Emprunt;
import Document.Document;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpruntDocument extends GestionEmprunt {
    public GestionEmpruntDocument() {
        super(); // Appelle le constructeur de la classe parente (GestionEmprunt)
    }

    // Vous pouvez ajouter des méthodes spécifiques à GestionEmpruntDocument ici

    public List<Emprunt> rechercherEmpruntsParDocument(Document document) {
        List<Emprunt> empruntsDocument = new ArrayList<>();
        for (Emprunt emprunt : getEmprunts()) {
            if (emprunt.getDocumentEmprunte().equals(document)) {
                empruntsDocument.add(emprunt);
            }
        }
        return empruntsDocument;
    }
}
