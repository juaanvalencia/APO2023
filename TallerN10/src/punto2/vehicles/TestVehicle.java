package punto2.vehicles;

import punto2.vehicles.Vehicle;

public class TestVehicle {
    public TestVehicle() {
        Vehicle vehicle1 = new Vehicle("Vision");
        Vehicle vehicle2 = new Vehicle("Edict");

        vehicle2.setMake("Seer");
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }

}