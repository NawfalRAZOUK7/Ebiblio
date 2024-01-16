package Emprunt;

import java.util.Date;

import Document.Dictionnaire;
import Membre.Membre;

public class EmpruntDictionnaire extends Emprunt {
    private String langue;

    public EmpruntDictionnaire(int idEmprunt, Membre emprunteur, Dictionnaire dictionnaire, Date dateEmprunt, Date dateRetour, String langue) {
        super(idEmprunt, emprunteur, dictionnaire, dateEmprunt, dateRetour);
        this.langue = langue;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }
}

