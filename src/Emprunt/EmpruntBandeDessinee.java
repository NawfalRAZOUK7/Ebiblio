package Emprunt;

import java.util.Date;

import Document.BandeDessinee;
import Membre.Membre;

public class EmpruntBandeDessinee extends Emprunt {
    private boolean avecAutographe;

    public EmpruntBandeDessinee(int idEmprunt, Membre emprunteur, BandeDessinee bandeDessinee, Date dateEmprunt, Date dateRetour, boolean avecAutographe) {
        super(idEmprunt, emprunteur, bandeDessinee, dateEmprunt, dateRetour);
        this.avecAutographe = avecAutographe;
    }

    public boolean isAvecAutographe() {
        return avecAutographe;
    }

    public void setAvecAutographe(boolean avecAutographe) {
        this.avecAutographe = avecAutographe;
    }
}

