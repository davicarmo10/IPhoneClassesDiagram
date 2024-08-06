package device;

import media.Itunes;
import navigation.Safari;
import telephony.Telephone;

public class Iphone {
    public static void main(String[] args) {
        Itunes itunes = new Itunes();
        Safari safari = new Safari();
        Telephone telephone = new Telephone();
        
        openItunes(itunes);
        openSafari(safari);
        openTelephone(telephone);
    }

   
    public static void openItunes(Itunes app) {
        app.playSong();
        app.openVideoClip();
    }

    public static void openSafari(Safari safari) {
        safari.search();
    }

    public static void openTelephone(Telephone telephone) {
        telephone.call();
    }
}