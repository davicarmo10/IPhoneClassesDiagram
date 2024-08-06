package telephony;

public class Telephone {

    public int currentCall;
    public int recentCall;
    public boolean hasVoiceMail;

    public void call () 
    {
        System.out.println("making a call");
    }

    public void receiveCall () 
    {
        System.out.println("receiving a call");
    }
    public void makeVideoCall ()
    {
        System.out.println("making a videocall");
    }
    public void closeApp ()
    {
        System.out.println("Telephone closed");
    }
}
