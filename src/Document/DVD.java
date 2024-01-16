package Document;

import java.util.Date;

public class DVD extends Document {
    private int dureeMinutes;
    private String nomRealisateur;

    public DVD(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
            int dureeMinutes, String nomRealisateur) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.dureeMinutes = dureeMinutes;
        this.nomRealisateur = nomRealisateur;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public void setDureeMinutes(int dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }

    public String getNomRealisateur() {
        return nomRealisateur;
    }

    public void setNomRealisateur(String nomRealisateur) {
        this.nomRealisateur = nomRealisateur;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Durée du DVD en minutes : " + dureeMinutes);
        System.out.println("Nom du réalisateur : " + nomRealisateur);
    }
}

