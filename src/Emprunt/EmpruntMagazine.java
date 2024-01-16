package Emprunt;

import java.util.Date;

import Document.Magazine;
import Membre.Membre;

public class EmpruntMagazine extends Emprunt {
    private String nomMoisEdition;
    private int jourPublication;

    public EmpruntMagazine(int idEmprunt, Membre emprunteur, Magazine magazine, Date dateEmprunt, Date dateRetour, String nomMoisEdition, int jourPublication) {
        super(idEmprunt, emprunteur, magazine, dateEmprunt, dateRetour);
        this.nomMoisEdition = nomMoisEdition;
        this.jourPublication = jourPublication;
    }

    public String getNomMoisEdition() {
        return nomMoisEdition;
    }

    public void setNomMoisEdition(String nomMoisEdition) {
        this.nomMoisEdition = nomMoisEdition;
    }

    public int getJourPublication() {
        return jourPublication;
    }

    public void setJourPublication(int jourPublication) {
        this.jourPublication = jourPublication;
    }
}

