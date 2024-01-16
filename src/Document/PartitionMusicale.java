package Document;

import java.util.Date;

public class PartitionMusicale extends Document {
    private String compositeur;
    private String instrument;

    public PartitionMusicale(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                            String compositeur, String instrument) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.compositeur = compositeur;
        this.instrument = instrument;
    }

    public String getCompositeur() {
        return compositeur;
    }

    public void setCompositeur(String compositeur) {
        this.compositeur = compositeur;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Compositeur : " + compositeur);
        System.out.println("Instrument : " + instrument);
    }
}

