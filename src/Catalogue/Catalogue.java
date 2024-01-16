package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.Document;



public class Catalogue {
    private List<Document> documents;

    public Catalogue() {
        this.documents = new ArrayList<>();
    }

    public void ajouterDocument(Document document) {
        documents.add(document);
    }

    public void retirerDocument(Document document) {
        documents.remove(document);
    }

    public Document rechercherDocumentParTitre(String titre) {
        for (Document document : documents) {
            if (document.getTitre().equals(titre)) {
                return document;
            }
        }
        return null; // Retourne null si le document n'est pas trouvé.
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void afficherCatalogue() {
        for (Document document : documents) {
            document.afficherDetails();
            System.out.println("--------------------");
        }
    }
}


