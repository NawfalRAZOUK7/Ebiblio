package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.Dictionnaire;

public class CatalogueDictionnaire extends Catalogue {
    private List<Dictionnaire> dictionnaireCollection;

    public CatalogueDictionnaire() {
        this.dictionnaireCollection = new ArrayList<>();
    }

    public void ajouterDictionnaire(Dictionnaire dictionnaire) {
        dictionnaireCollection.add(dictionnaire);
        super.ajouterDocument(dictionnaire);
    }

    public void retirerDictionnaire(Dictionnaire dictionnaire) {
        dictionnaireCollection.remove(dictionnaire);
        super.retirerDocument(dictionnaire);
    }

    public Dictionnaire rechercherDictionnaireParTitre(String titre) {
        for (Dictionnaire dictionnaire : dictionnaireCollection) {
            if (dictionnaire.getTitre().equals(titre)) {
                return dictionnaire;
            }
        }
        return null; // Retourne null si le dictionnaire n'est pas trouvé.
    }

    public List<Dictionnaire> getDictionnaireCollection() {
        return dictionnaireCollection;
    }
}
