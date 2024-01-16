package Document;

import java.util.Date;

public class Rapport extends Document {
    private String auteurRapport;
    private String institution;
    private Date datePublicationRapport;

    public Rapport(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                String auteurRapport, String institution, Date datePublicationRapport) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.auteurRapport = auteurRapport;
        this.institution = institution;
        this.datePublicationRapport = datePublicationRapport;
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

    public Date getDatePublicationRapport() {
        return datePublicationRapport;
    }

    public void setDatePublicationRapport(Date datePublicationRapport) {
        this.datePublicationRapport = datePublicationRapport;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Auteur du rapport : " + auteurRapport);
        System.out.println("Institution : " + institution);
        System.out.println("Date de publication du rapport : " + datePublicationRapport);
    }
}

