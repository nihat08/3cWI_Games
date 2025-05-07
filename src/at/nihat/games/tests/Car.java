package at.nihat.games.tests;

public class Car extends Abstract{

    public Car(String name, int id) {
        super(name, id);
    }

    @Override
    public void drive() {
        System.out.println("Car is driving..");

    }
}
