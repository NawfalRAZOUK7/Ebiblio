package Document;

import java.util.Date;

public class Journal extends Document {
    private Date dateParution;
    private String nomEditeur;

    public Journal(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                Date dateParution, String nomEditeur) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.dateParution = dateParution;
        this.nomEditeur = nomEditeur;
    }

    public Date getDateParution() {
        return dateParution;
    }

    public void setDateParution(Date dateParution) {
        this.dateParution = dateParution;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Date de parution du journal : " + dateParution);
        System.out.println("Nom de l'éditeur : " + nomEditeur);
    }
}

