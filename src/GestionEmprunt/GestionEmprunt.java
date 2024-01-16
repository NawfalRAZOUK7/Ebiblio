package GestionEmprunt;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Emprunt.Emprunt;
import Membre.Membre;

public class GestionEmprunt {
    private List<Emprunt> emprunts;

    public GestionEmprunt() {
        emprunts = new ArrayList<>();
    }

    public void ajouterEmprunt(Emprunt emprunt) {
        emprunts.add(emprunt);
    }

    public void supprimerEmprunt(Emprunt emprunt) {
        emprunts.remove(emprunt);
    }

    public List<Emprunt> getEmprunts() {
        return emprunts;
    }

    public List<Emprunt> rechercherEmpruntsParMembre(Membre membre) {
        List<Emprunt> empruntsMembre = new ArrayList<>();
        for (Emprunt emprunt : emprunts) {
            if (emprunt.getEmprunteur().equals(membre)) {
                empruntsMembre.add(emprunt);
            }
        }
        return empruntsMembre;
    }

    public List<Emprunt> rechercherEmpruntsEnRetard() {
        List<Emprunt> empruntsEnRetard = new ArrayList<>();
        Date dateCourante = new Date();
        for (Emprunt emprunt : emprunts) {
            if (emprunt.getDateRetour().before(dateCourante)) {
                empruntsEnRetard.add(emprunt);
            }
        }
        return empruntsEnRetard;
    }

    public void marquerEmpruntCommeRendu(Emprunt emprunt) {
        emprunt.setRendu(true);
    }
}
