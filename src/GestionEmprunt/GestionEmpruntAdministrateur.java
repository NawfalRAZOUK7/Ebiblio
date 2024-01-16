package GestionEmprunt;

import Emprunt.Emprunt;
import java.util.List;

public class GestionEmpruntAdministrateur extends GestionEmprunt {

    public GestionEmpruntAdministrateur() {
        super();
    }

    // Méthode spécifique à l'administrateur pour marquer un emprunt comme rendu
    public void marquerEmpruntCommeRendu(Emprunt emprunt) {
        emprunt.setRendu(true);
    }

    // Méthode spécifique à l'administrateur pour supprimer un emprunt
    public void supprimerEmprunt(Emprunt emprunt) {
        super.supprimerEmprunt(emprunt);
    }

    // Méthode spécifique à l'administrateur pour afficher tous les emprunts
    public List<Emprunt> afficherTousLesEmprunts() {
        return super.getEmprunts();
    }
}
