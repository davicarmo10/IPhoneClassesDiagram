package primaryClasses;

public abstract interface Dialer {
    public void call () 
    {
        System.out.println("making a call");
    }

    public void receiveCall () 
    {
        System.out.println("receiving a call");
    }
}
