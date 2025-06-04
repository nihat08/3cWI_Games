package at.nihat.games.tests;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 1);
        Car car2 = new Car("BMW", 2);
        Car car3 = new Car("Toyota", 3);
        //car1.drive();
        //System.out.println(car.getName());
        //System.out.println(car.getId());

        Train train1 = new Train("REX", 11);
        Train train2 = new Train("S1", 22);
        //train1.drive();
        //System.out.println(train.getName());
        //System.out.println(train.getId());

        AeroCar aeroCar1 = new AeroCar("Aero1", 111);
        AeroCar aeroCar2 = new AeroCar("Aero2", 222);
        aeroCar1.drive();
        aeroCar1.fly();

        CarDealer carDealer = new CarDealer();

        /*carDealer.addVehicle(car1);
        carDealer.addVehicle(car2);
        carDealer.addVehicle(car3);
        carDealer.addVehicle(train1);
        carDealer.addVehicle(train2);
        carDealer.addVehicle(aeroCar1);
        carDealer.addVehicle(aeroCar2);

        carDealer.printVehicle();
*/
    }


}
