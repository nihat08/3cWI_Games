package at.nihat.games.SemTest;

public class AudioBook extends AbstractBook{
    public AudioBook(int id, int price, String titel, String desc) {
        super(id, price, titel, desc);
    }
    public void playSample(){
        System.out.println("Song is playing...");
    }
}
