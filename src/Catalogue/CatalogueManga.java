package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.Manga;

public class CatalogueManga extends Catalogue {
    private List<Manga> mangaCollection;

    public CatalogueManga() {
        this.mangaCollection = new ArrayList<>();
    }

    public void ajouterManga(Manga manga) {
        mangaCollection.add(manga);
        super.ajouterDocument(manga);
    }

    public void retirerManga(Manga manga) {
        mangaCollection.remove(manga);
        super.retirerDocument(manga);
    }

    public Manga rechercherMangaParTitre(String titre) {
        for (Manga manga : mangaCollection) {
            if (manga.getTitre().equals(titre)) {
                return manga;
            }
        }
        return null; // Retourne null si le manga n'est pas trouvé.
    }

    public List<Manga> getMangaCollection() {
        return mangaCollection;
    }
}
