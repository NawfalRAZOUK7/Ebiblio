package Membre;

public class Invite extends Membre {
    private int numeroCarte;

    public Invite(int id, String nom, String prenom, String adresse, String email, int numeroCarte) {
        super(id, nom, prenom, adresse, email);
        this.numeroCarte = numeroCarte;
    }

    public int getNumeroCarte() {
        return numeroCarte;
    }

    public void setNumeroCarte(int numeroCarte) {
        this.numeroCarte = numeroCarte;
    }

    @Override
    public String toString() {
        return super.toString() + " - Invite [numeroCarte=" + numeroCarte + "]";
    }
}

