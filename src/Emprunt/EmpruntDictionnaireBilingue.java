package Emprunt;

import java.util.Date;

import Document.DictionnaireBilingue;
import Membre.Membre;

public class EmpruntDictionnaireBilingue extends Emprunt {
    private String langues;

    public EmpruntDictionnaireBilingue(int idEmprunt, Membre emprunteur, DictionnaireBilingue dictionnaireBilingue, Date dateEmprunt, Date dateRetour, String langues) {
        super(idEmprunt, emprunteur, dictionnaireBilingue, dateEmprunt, dateRetour);
        this.langues = langues;
    }

    public String getLangues() {
        return langues;
    }

    public void setLangues(String langues) {
        this.langues = langues;
    }
}
