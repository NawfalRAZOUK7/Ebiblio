package Emprunt;

import java.util.Date;

import Document.Document;
import Membre.Membre;

public class Emprunt {
    private int idEmprunt;
    private Membre emprunteur;
    private Document document;
    private Date dateEmprunt;
    private Date dateRetour;
    private boolean rendu;
    private Document documentEmprunte;


    public Emprunt(int idEmprunt, Membre emprunteur, Document document, Date dateEmprunt, Date dateRetour) {
        this.idEmprunt = idEmprunt;
        this.emprunteur = emprunteur;
        this.document = document;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
    }

    public int getIdEmprunt() {
        return idEmprunt;
    }

    public Membre getEmprunteur() {
        return emprunteur;
    }

    public Document getDocument() {
        return document;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public boolean isRendu() {
        return rendu;
    }

    public void setRendu(boolean rendu) {
        this.rendu = rendu;
    }

    public Document getDocumentEmprunte() {
        return documentEmprunte;
    }
    
    
}
