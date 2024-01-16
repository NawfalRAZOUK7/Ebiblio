package Document;

import java.util.Date;

public class CDAudio extends Document {
    private int dureeMinutes;
    private String nomArtiste;

    public CDAudio(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                    int dureeMinutes, String nomArtiste) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.dureeMinutes = dureeMinutes;
        this.nomArtiste = nomArtiste;
    }

    public int getDureeMinutes() {
        return dureeMinutes;
    }

    public void setDureeMinutes(int dureeMinutes) {
        this.dureeMinutes = dureeMinutes;
    }

    public String getNomArtiste() {
        return nomArtiste;
    }

    public void setNomArtiste(String nomArtiste) {
        this.nomArtiste = nomArtiste;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Durée du CD audio en minutes : " + dureeMinutes);
        System.out.println("Nom de l'artiste : " + nomArtiste);
    }
}

