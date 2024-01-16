package Document;

import java.util.Date;

public class DictionnaireBilingue extends Document {
    private String langues;
    private int nombreTomes;

    public DictionnaireBilingue(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                                String langues, int nombreTomes) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.langues = langues;
        this.nombreTomes = nombreTomes;
    }

    public String getLangues() {
        return langues;
    }

    public void setLangues(String langues) {
        this.langues = langues;
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
        System.out.println("Langues du dictionnaire : " + langues);
        System.out.println("Nombre de tomes : " + nombreTomes);
    }
}

