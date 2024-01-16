package Document;

import java.util.Date;

public class Magazine extends Document {
    private String periodicitePublication;
    private int moisEdition;
    private int jourPublication;

    public Magazine(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                    String periodicitePublication, int moisEdition, int jourPublication) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.periodicitePublication = periodicitePublication;
        this.moisEdition = moisEdition;
        this.jourPublication = jourPublication;
    }

    public String getPeriodicitePublication() {
        return periodicitePublication;
    }

    public void setPeriodicitePublication(String periodicitePublication) {
        this.periodicitePublication = periodicitePublication;
    }

    public int getMoisEdition() {
        return moisEdition;
    }

    public void setMoisEdition(int moisEdition) {
        this.moisEdition = moisEdition;
    }

    public int getJourPublication() {
        return jourPublication;
    }

    public void setJourPublication(int jourPublication) {
        this.jourPublication = jourPublication;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Périodicité de publication : " + periodicitePublication);
        System.out.println("Mois d'édition : " + moisEdition);
        System.out.println("Jour de publication : " + jourPublication);
    }
}

