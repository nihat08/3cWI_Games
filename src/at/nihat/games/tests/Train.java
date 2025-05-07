package at.nihat.games.tests;

public class Train extends Abstract{

    public Train(String name, int id) {
        super(name, id);
    }

    @Override
    public void drive() {
        System.out.println("Train is driving..");
    }
}
