package GestionEmprunt;

import Emprunt.Emprunt;
import Membre.Membre;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpruntMembre extends GestionEmprunt {
    public GestionEmpruntMembre() {
        super(); // Appel au constructeur de la classe parente GestionEmprunt
    }

    public List<Emprunt> rechercherEmpruntsParMembre(Membre membre) {
        List<Emprunt> empruntsMembre = new ArrayList<>();
        for (Emprunt emprunt : super.getEmprunts()) {
            if (emprunt.getEmprunteur() instanceof Membre && emprunt.getEmprunteur().equals(membre)) {
                empruntsMembre.add(emprunt);
            }
        }
        return empruntsMembre;
    }
}
