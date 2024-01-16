package Membre;

public class Administrateur extends Membre {
    private String role;

    public Administrateur(int id, String nom, String prenom, String adresse, String email, String role) {
        super(id, nom, prenom, adresse, email);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return super.toString() + " - Administrateur [role=" + role + "]";
    }
}

