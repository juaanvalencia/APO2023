package punto1.vehicles;

import punto1.vehicles.Vehicle;

public class TestVehicle {
    public TestVehicle() {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);

        Vehicle vehicle1 = new Vehicle("Vision");
        System.out.println(vehicle1);

        Vehicle vehicle2 = new Vehicle("Edict");
        System.out.println(vehicle2);

        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }

}

