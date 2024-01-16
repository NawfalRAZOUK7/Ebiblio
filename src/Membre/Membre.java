package Membre;

import java.util.ArrayList;
import java.util.List;

import Document.Document;

public class Membre {
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String email;
    private List<Document> documentsEmpruntes;

    public Membre(int id, String nom, String prenom, String adresse, String email) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.email = email;
        this.documentsEmpruntes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Document> getDocumentsEmpruntes() {
        return documentsEmpruntes;
    }

    public void emprunterDocument(Document document) {
        documentsEmpruntes.add(document);
    }

    public void retournerDocument(Document document) {
        documentsEmpruntes.remove(document);
    }

    @Override
    public String toString() {
        return "Membre [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", email=" + email
                + "]";
    }
}

