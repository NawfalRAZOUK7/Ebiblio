package GestionEmprunt;

import Emprunt.Emprunt;
import Membre.Invite;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpruntInvite extends GestionEmprunt {
    public GestionEmpruntInvite() {
        super(); // Appel au constructeur de la classe parente GestionEmprunt
    }

    public List<Emprunt> rechercherEmpruntsParInvite(Invite invite) {
        List<Emprunt> empruntsInvite = new ArrayList<>();
        for (Emprunt emprunt : super.getEmprunts()) {
            if (emprunt.getEmprunteur() instanceof Invite && emprunt.getEmprunteur().equals(invite)) {
                empruntsInvite.add(emprunt);
            }
        }
        return empruntsInvite;
    }
}
