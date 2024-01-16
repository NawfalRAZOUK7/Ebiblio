package Emprunt;

import java.util.Date;

import Document.PartitionMusicale;
import Membre.Membre;

public class EmpruntPartitionMusicale extends Emprunt {
    private String nomCompositeur;
    private String instrument;

    public EmpruntPartitionMusicale(int idEmprunt, Membre emprunteur, PartitionMusicale partitionMusicale, Date dateEmprunt, Date dateRetour, String nomCompositeur, String instrument) {
        super(idEmprunt, emprunteur, partitionMusicale, dateEmprunt, dateRetour);
        this.nomCompositeur = nomCompositeur;
        this.instrument = instrument;
    }

    public String getNomCompositeur() {
        return nomCompositeur;
    }

    public void setNomCompositeur(String nomCompositeur) {
        this.nomCompositeur = nomCompositeur;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
