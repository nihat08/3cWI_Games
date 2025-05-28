package at.nihat.games.SemTest;

public class Novel extends AbstractBook{
    private String genre;
    public Novel(int id, int price, String titel, String desc, String genre) {
        super(id, price, titel, desc);
        this.genre=genre;
    }

    public String getGenre() {
        return genre;
    }
}
