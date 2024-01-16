package Emprunt;

import java.util.Date;

import Document.DVD;
import Membre.Membre;

public class EmpruntDVD extends Emprunt {
    private String nomRealisateur;
    private int dureeMinutes;

    public EmpruntDVD(int idEmprunt, Membre emprunteur, DVD dvd, Date dateEmprunt, Date dateRetour, String nomRealisateur, int dureeMinutes) {
        super(idEmprunt, emprunteur, dvd, dateEmprunt, dateRetour);
        this.nomRealisateur = nomRealisateur;
        this.dureeMinutes = dureeMinutes;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public void setDureeMinutes(int dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }
}


