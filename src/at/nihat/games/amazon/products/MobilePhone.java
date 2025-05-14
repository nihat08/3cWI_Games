package at.nihat.games.amazon.products;

public class MobilePhone extends AbstractProduct{
    private String call;
    public MobilePhone(int id, int price, String titel, String description, String call) {
        super(id, price, titel, description);
        this.call=call;
    }
}
