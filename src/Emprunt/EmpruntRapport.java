package Emprunt;

import java.util.Date;

import Document.Rapport;
import Membre.Membre;

public class EmpruntRapport extends Emprunt {
    private String auteurRapport;
    private String institution;
    private Date datePublication;

    public EmpruntRapport(int idEmprunt, Membre emprunteur, Rapport rapport, Date dateEmprunt, Date dateRetour, String auteurRapport, String institution, Date datePublication) {
        super(idEmprunt, emprunteur, rapport, dateEmprunt, dateRetour);
        this.auteurRapport = auteurRapport;
        this.institution = institution;
        this.datePublication = datePublication;
    }

    public String getAuteurRapport() {
        return auteurRapport;
    }

    public void setAuteurRapport(String auteurRapport) {
        this.auteurRapport = auteurRapport;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }
}
