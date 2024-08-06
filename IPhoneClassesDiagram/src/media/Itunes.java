package media;

public class Itunes {
    public String currentSong;

    public void playSong () 
    {
        System.out.println("Playing ");
    }
    public void pauseSong () 
    {
        System.out.println("Paused ");
    }
    public void fowardSong () 
    {
        System.out.println("Song Skipped");
    }
    public void returnSong () 
    {
        System.out.println("Playing previous music");
    }
    public void openVideoClip()
    {
        System.out.println("open a videoClip");
    }
    public void closeApp ()
    {
        System.out.println("Itunes closed");
    }
}
