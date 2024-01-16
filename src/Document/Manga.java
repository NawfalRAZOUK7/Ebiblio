package Document;

import java.util.Date;

public class Manga extends Document {
    private String auteurIllustrateur;
    private int nombreVolumes;

    public Manga(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                String auteurIllustrateur, int nombreVolumes) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.auteurIllustrateur = auteurIllustrateur;
        this.nombreVolumes = nombreVolumes;
    }

    public String getAuteurIllustrateur() {
        return auteurIllustrateur;
    }

    public void setAuteurIllustrateur(String auteurIllustrateur) {
        this.auteurIllustrateur = auteurIllustrateur;
    }

    public int getNombreVolumes() {
        return nombreVolumes;
    }

    public void setNombreVolumes(int nombreVolumes) {
        this.nombreVolumes = nombreVolumes;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Auteur/Illustrateur du manga : " + auteurIllustrateur);
        System.out.println("Nombre de volumes : " + nombreVolumes);
    }
}

