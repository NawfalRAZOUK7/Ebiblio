package Document;

import java.util.Date;

public class Dictionnaire extends Document {
    private String langue;
    private int nombreTomes;

    public Dictionnaire(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                        String langue, int nombreTomes) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.langue = langue;
        this.nombreTomes = nombreTomes;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public int getNombreTomes() {
        return nombreTomes;
    }

    public void setNombreTomes(int nombreTomes) {
        this.nombreTomes = nombreTomes;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Langue du dictionnaire : " + langue);
        System.out.println("Nombre de tomes : " + nombreTomes);
    }
}
