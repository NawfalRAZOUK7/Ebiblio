package Emprunt;

import java.util.Date;

import Document.Thèse;
import Membre.Membre;
public class EmpruntThèse extends Emprunt {
    private String directeurThèse;
    private String université;

    public EmpruntThèse(int idEmprunt, Membre emprunteur, Thèse thèse, Date dateEmprunt, Date dateRetour, String directeurThèse, String université) {
        super(idEmprunt, emprunteur, thèse, dateEmprunt, dateRetour);
        this.directeurThèse = directeurThèse;
        this.université = université;
    }

    public String getDirecteurThèse() {
        return directeurThèse;
    }

    public void setDirecteurThèse(String directeurThèse) {
        this.directeurThèse = directeurThèse;
    }

    public String getUniversité() {
        return université;
    }

    public void setUniversité(String université) {
        this.université = université;
    }
}


