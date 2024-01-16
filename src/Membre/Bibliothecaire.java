package Membre;

public class Bibliothecaire extends Membre {
    private String bureau;

    public Bibliothecaire(int id, String nom, String prenom, String adresse, String email, String bureau) {
        super(id, nom, prenom, adresse, email);
        this.bureau = bureau;
    }

    public String getBureau() {
        return bureau;
    }

    public void setBureau(String bureau) {
        this.bureau = bureau;
    }

    @Override
    public String toString() {
        return super.toString() + " - Bibliothecaire [bureau=" + bureau + "]";
    }
}

