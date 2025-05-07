package at.nihat.games.tests;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private List<Abstract> vehicles = new ArrayList<Abstract>();

    public void printVehicle(){
        for (Abstract vehicle : vehicles){
            System.out.println("Marke: " + vehicle.getName() + ", " + "Id: " + vehicle.getId());
        }
    }

    public void addVehicle(Abstract vehicle){
        vehicles.add(vehicle);
    }
}
