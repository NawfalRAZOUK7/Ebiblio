package Emprunt;

import java.util.Date;

import Document.CDAudio;
import Membre.Membre;

public class EmpruntCDAudio extends Emprunt {
    private String artiste;

    public EmpruntCDAudio(int idEmprunt, Membre emprunteur, CDAudio cdAudio, Date dateEmprunt, Date dateRetour, String artiste) {
        super(idEmprunt, emprunteur, cdAudio, dateEmprunt, dateRetour);
        this.artiste = artiste;
    }

    public String getArtiste() {
        return artiste;
    }

    public void setArtiste(String artiste) {
        this.artiste = artiste;
    }
}
