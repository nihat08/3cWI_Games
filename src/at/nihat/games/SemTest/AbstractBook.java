package at.nihat.games.SemTest;

public class AbstractBook implements Books{
    private int id;
    private int price;
    private String titel;
    private String desc;

    public AbstractBook(int id, int price, String titel, String desc) {
        this.id = id;
        this.price = price;
        this.titel = titel;
        this.desc = desc;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getTitel() {
        return titel;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
