package Membre;

public class Professeur extends Membre {
    private String departement;
    private String specialite;

    public Professeur(int id, String nom, String prenom, String adresse, String email, String departement, String specialite) {
        super(id, nom, prenom, adresse, email);
        this.departement = departement;
        this.specialite = specialite;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + " - Professeur [departement=" + departement + ", specialite=" + specialite + "]";
    }
}

