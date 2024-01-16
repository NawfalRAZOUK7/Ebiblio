package Document;

import java.util.Date;

public class Thèse extends Document {
    private String directeurThèse;
    private String universitéSoutenance;

    public Thèse(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                String directeurThèse, String universitéSoutenance) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.directeurThèse = directeurThèse;
        this.universitéSoutenance = universitéSoutenance;
    }

    public String getDirecteurThèse() {
        return directeurThèse;
    }

    public void setDirecteurThèse(String directeurThèse) {
        this.directeurThèse = directeurThèse;
    }

    public String getUniversitéSoutenance() {
        return universitéSoutenance;
    }

    public void setUniversitéSoutenance(String universitéSoutenance) {
        this.universitéSoutenance = universitéSoutenance;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Directeur de thèse : " + directeurThèse);
        System.out.println("Université de soutenance : " + universitéSoutenance);
    }
}

