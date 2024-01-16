import GestionEmprunt.GestionEmprunt;
import Membre.Etudiant;
import Membre.Membre;

import java.util.Date;

import Document.Document;
import Document.Livre;
import Emprunt.Emprunt;

public class App {
    public static void main(String[] args) {
        // Création de la gestion des emprunts
        GestionEmprunt gestionEmprunt = new GestionEmprunt();

        // Création d'un membre (étudiant)
        Etudiant etudiant = new Etudiant(1, "John", "Doe", "123 Main St", "john@example.com", "Informatique", 2);

        // Création d'un livre
        Date datePublication = new Date(); // Remplacez ceci par la vraie date de publication
        Livre livre = new Livre(101, "Le Seigneur des Anneaux", "J.R.R. Tolkien", datePublication, "Fantasy", "Bibliothèque 1", 100, "Roman", 1);

        // Création d'un emprunt
        Document document = livre; // Utilisez le livre comme document emprunté
        Date dateEmprunt = new Date(); // Date d'emprunt (à remplacer par la vraie date)
        Date dateRetour = new Date(); // Date de retour (à remplacer par la vraie date)
        Emprunt emprunt = new Emprunt(1, etudiant, document, dateEmprunt, dateRetour);

        // Ajout de l'emprunt à la gestion des emprunts
        gestionEmprunt.ajouterEmprunt(emprunt);

        // Recherche des emprunts par membre
        System.out.println("Emprunts de " + etudiant.getNom() + ":");
        for (Emprunt e : gestionEmprunt.rechercherEmpruntsParMembre(etudiant)) {
            System.out.println("ID de l'emprunt : " + e.getIdEmprunt());
            System.out.println("Titre du document emprunté : " + e.getDocument().getTitre());
            System.out.println("Date d'emprunt : " + e.getDateEmprunt());
            System.out.println("Date de retour prévue : " + e.getDateRetour());
            System.out.println("Statut de l'emprunt : " + (e.isRendu() ? "Rendu" : "Non rendu"));
            System.out.println();
        }
    }
}
