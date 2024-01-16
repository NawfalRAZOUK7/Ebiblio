package GestionEmprunt;

import Emprunt.Emprunt;
import Membre.Membre;
import java.util.List;

public class GestionEmpruntBibliothecaire extends GestionEmprunt {

    public GestionEmpruntBibliothecaire() {
        super();
    }

    // Méthode spécifique au bibliothécaire pour marquer un emprunt comme rendu
    public void marquerEmpruntCommeRendu(Emprunt emprunt) {
        emprunt.setRendu(true);
    }

    // Méthode spécifique au bibliothécaire pour supprimer un emprunt
    public void supprimerEmprunt(Emprunt emprunt) {
        super.supprimerEmprunt(emprunt);
    }

    // Méthode spécifique au bibliothécaire pour afficher tous les emprunts
    public List<Emprunt> afficherTousLesEmprunts() {
        return super.getEmprunts();
    }

    // Méthode spécifique au bibliothécaire pour rechercher les emprunts par membre
    public List<Emprunt> rechercherEmpruntsParMembre(Membre membre) {
        return super.rechercherEmpruntsParMembre(membre);
    }
}
