package at.nihat.games.amazon.products;

public class Sneaker extends AbstractProduct{
    private String color;
    public Sneaker(int id, int price, String titel, String description, String color) {
        super(id, price, titel, description);
        this.color=color;
    }


}
