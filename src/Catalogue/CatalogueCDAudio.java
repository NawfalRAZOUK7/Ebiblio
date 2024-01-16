package Catalogue;

import java.util.ArrayList;
import java.util.List;

import Document.CDAudio;

public class CatalogueCDAudio extends Catalogue {
    private List<CDAudio> cdAudioCollection;

    public CatalogueCDAudio() {
        this.cdAudioCollection = new ArrayList<>();
    }

    public void ajouterCDAudio(CDAudio cdAudio) {
        cdAudioCollection.add(cdAudio);
        super.ajouterDocument(cdAudio);
    }

    public void retirerCDAudio(CDAudio cdAudio) {
        cdAudioCollection.remove(cdAudio);
        super.retirerDocument(cdAudio);
    }

    public CDAudio rechercherCDAudioParTitre(String titre) {
        for (CDAudio cdAudio : cdAudioCollection) {
            if (cdAudio.getTitre().equals(titre)) {
                return cdAudio;
            }
        }
        return null; // Retourne null si le CD audio n'est pas trouvé.
    }

    public List<CDAudio> getCDAudioCollection() {
        return cdAudioCollection;
    }
}
