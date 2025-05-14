package at.nihat.games.amazon.products;

public abstract class AbstractProduct implements Product{
    private int id;
    private int price;
    private String titel;
    private String description;

    public AbstractProduct(int id, int price, String titel, String description) {
        this.id = id;
        this.price = price;
        this.titel = titel;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getTitel() {
        return titel;
    }
}
