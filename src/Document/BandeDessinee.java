package Document;

import java.util.Date;

public class BandeDessinee extends Document {
    private String auteurIllustrateur;
    private int nombrePages;

    public BandeDessinee(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                        String auteurIllustrateur, int nombrePages) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.auteurIllustrateur = auteurIllustrateur;
        this.nombrePages = nombrePages;
    }

    public String getAuteurIllustrateur() {
        return auteurIllustrateur;
    }

    public void setAuteurIllustrateur(String auteurIllustrateur) {
        this.auteurIllustrateur = auteurIllustrateur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    public void setNombrePages(int nombrePages) {
        this.nombrePages = nombrePages;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Auteur/Illustrateur de la bande dessinée : " + auteurIllustrateur);
        System.out.println("Nombre de pages : " + nombrePages);
    }
}
