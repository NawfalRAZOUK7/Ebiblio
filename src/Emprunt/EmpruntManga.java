package Emprunt;

import java.util.Date;

import Document.Manga;
import Membre.Membre;

public class EmpruntManga extends Emprunt {
    private String nomAuteur;
    private int nombreVolumes;

    public EmpruntManga(int idEmprunt, Membre emprunteur, Manga manga, Date dateEmprunt, Date dateRetour, String nomAuteur, int nombreVolumes) {
        super(idEmprunt, emprunteur, manga, dateEmprunt, dateRetour);
        this.nomAuteur = nomAuteur;
        this.nombreVolumes = nombreVolumes;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public int getNombreVolumes() {
        return nombreVolumes;
    }

    public void setNombreVolumes(int nombreVolumes) {
        this.nombreVolumes = nombreVolumes;
    }
}


