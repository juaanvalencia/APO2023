package punto4.vehicles;

import punto4.vehicles.Vehicle;
import punto4.vehicles.Vehicle.Engine;

public class TestVehicle {
    public TestVehicle() {
        Vehicle vehicle1 = new Vehicle("Vision");
        Vehicle vehicle2 = new Vehicle("Edict");

        vehicle2.setMake("Seer");
        System.out.println(vehicle1);
        System.out.println(vehicle2);

        Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
        System.out.println("Vehicle number " + vehicle3.getChassisNo() + " is a " + vehicle3.getModel() + " model and has an engine capacity of " + Engine.getCapacity() + "cc");

        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }

}