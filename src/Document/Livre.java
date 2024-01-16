package Document;
import java.util.Date;

public class Livre extends Document {
    private int nombreDePages;
    private String typeDeLivre;
    private int numeroDeTome;

    public Livre(int id, String titre, String auteur, Date datePublication, String genre, String emplacement,
                int nombreDePages, String typeDeLivre, int numeroDeTome) {
        super(id, titre, auteur, datePublication, genre, emplacement);
        this.nombreDePages = nombreDePages;
        this.typeDeLivre = typeDeLivre;
        this.numeroDeTome = numeroDeTome;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public void setNombreDePages(int nombreDePages) {
        this.nombreDePages = nombreDePages;
    }

    public String getTypeDeLivre() {
        return typeDeLivre;
    }

    public void setTypeDeLivre(String typeDeLivre) {
        this.typeDeLivre = typeDeLivre;
    }

    public int getNumeroDeTome() {
        return numeroDeTome;
    }

    public void setNumeroDeTome(int numeroDeTome) {
        this.numeroDeTome = numeroDeTome;
    }

    @Override
    public void afficherDetails() {
        super.afficherDetails();
        System.out.println("Nombre de pages : " + nombreDePages);
        System.out.println("Type de livre : " + typeDeLivre);
        System.out.println("Numéro de tome : " + numeroDeTome);
    }
}
