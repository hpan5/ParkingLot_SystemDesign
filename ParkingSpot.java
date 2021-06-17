public class ParkingSpot {
    private final VehicleSize size;
    private Vehicle currentVehicle;

    ParkingSpot(VehicleSize size) {
        this.size = size;
    }

    boolean fit(Vehicle vehicle) {
        return currentVehicle == null && size.getSize() >= vehicle.getSize();
    }

    /*record a vehicle is parked in by updating the currentVehicle field*/
    void park(Vehicle vehicle) {
        currentVehicle = vehicle;
    }
}