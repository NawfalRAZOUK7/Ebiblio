package Emprunt;

import java.util.Date;

import Document.Livre;
import Membre.Membre;

public class EmpruntLivre extends Emprunt {
    private String nomAuteur;
    private int nombrePages;

    public EmpruntLivre(int idEmprunt, Membre emprunteur, Livre livre, Date dateEmprunt, Date dateRetour, String nomAuteur, int nombrePages) {
        super(idEmprunt, emprunteur, livre, dateEmprunt, dateRetour);
        this.nomAuteur = nomAuteur;
        this.nombrePages = nombrePages;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }
}

