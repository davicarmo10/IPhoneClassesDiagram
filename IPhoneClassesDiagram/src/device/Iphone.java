package device;

import secondaryClasses.Itunes;
import secondaryClasses.Telephone;
import secondaryClasses.Safari;

public class Iphone {
    private Itunes itunes;
    private Telephone telephone;
    private Safari safari;

    public Iphone() {
        this.itunes = new Itunes();
        this.telephone = new Telephone();
        this.safari = new Safari();
    }

    // MusicPlayer methods
    public void openItunes(String songName) {
        itunes.playSong();
    }

    public void openSafari() {
        safari.searchInIncogniteMode();
    }

    public void openTelephone() {
        telephone.call();
    }
}

