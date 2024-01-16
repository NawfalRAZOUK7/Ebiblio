package Membre;

public class Etudiant extends Membre {
    private String programme;
    private int annee;

    public Etudiant(int id, String nom, String prenom, String adresse, String email, String programme, int annee) {
        super(id, nom, prenom, adresse, email);
        this.programme = programme;
        this.annee = annee;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return super.toString() + " - Etudiant [programme=" + programme + ", annee=" + annee + "]";
    }
}

