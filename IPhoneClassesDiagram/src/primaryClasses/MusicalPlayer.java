package primaryClasses;


public abstract interface MusicalPlayer {
    private void playSong () 
    {
        System.out.println("Playing ");
    }
    private void pauseSong () 
    {
        System.out.println("Paused ");
    }
    private void fowardSong () 
    {
        System.out.println("Song Skipped");
    }private void returnSong () 
    {
        System.out.println("Playing previous music");
    }
}
