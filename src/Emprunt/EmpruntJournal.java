package Emprunt;

import java.util.Date;

import Document.Journal;
import Membre.Membre;

public class EmpruntJournal extends Emprunt {
    private String nomEditeur;
    private Date dateParution;

    public EmpruntJournal(int idEmprunt, Membre emprunteur, Journal journal, Date dateEmprunt, Date dateRetour, String nomEditeur, Date dateParution) {
        super(idEmprunt, emprunteur, journal, dateEmprunt, dateRetour);
        this.nomEditeur = nomEditeur;
        this.dateParution = dateParution;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public void setDateParution(Date dateParution) {
        this.dateParution = dateParution;
    }
}


