package at.nihat.games.tests;

public class AeroCar extends Abstract {

    public AeroCar(String name, int id) {
        super(name, id);
    }

    @Override
    public void drive() {
        System.out.println("Aero Car is driving..");
    }

    public void fly(){
        System.out.println("Aero Car is flying");
    }
}
