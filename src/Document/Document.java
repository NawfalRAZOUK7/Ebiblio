package Document;
import java.util.Date;

public class Document {
    // Attributs privés
    private int id;
    private String titre;
    private String auteur;
    private Date datePublication;
    private String genre;
    private boolean disponibilite;
    private String emplacement;

    // Constructeur
    public Document(int id, String titre, String auteur, Date datePublication, String genre, String emplacement) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.datePublication = datePublication;
        this.genre = genre;
        this.disponibilite = true; // Par défaut, le document est disponible
        this.emplacement = emplacement;
    }

    // Accesseurs
    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public String getGenre() {
        return genre;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public boolean isDisponible() {
        return disponibilite;
    }

    // Modificateurs
    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public void setDisponibilite(boolean disponible) {
        this.disponibilite = disponible;
    }

    // Méthode pour afficher les détails du document
    public void afficherDetails() {
        System.out.println("ID: " + id);
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("Date de publication: " + datePublication);
        System.out.println("Genre: " + genre);
        System.out.println("Emplacement: " + emplacement);
        System.out.println("Disponible: " + (disponibilite ? "Oui" : "Non"));
    }
}
