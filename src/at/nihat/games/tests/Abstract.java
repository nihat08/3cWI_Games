package at.nihat.games.tests;

public abstract class Abstract implements Vehicle{
    private String name;
    private int Id;

    public Abstract(String name, int id) {
        this.name = name;
        Id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return Id;
    }
}
