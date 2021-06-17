 public class Level {
    private final List<ParkingSpot> spots;

    Level(int numOfSpots) {
        List<ParkingSpot> list = new ArrayList<>(numOfSpots);
        int spotIdx = 0;
        for (; spotIdx < numOfSpots / 2; spotIdx++) {
            list.add(new ParkingSpot(VehicleSize.Compact));
        }
        for (; spotIdx < numOfSpots; spotIdx++) {
            list.add(new ParkingSpot(VehicleSize.Large));
        }
        spots = Collections.unmodifiableList(list);
    }

    private boolean hasSpot(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.fit(vehicle)) {
                spot.park(vehicle);
                return true;
            }
        }
        return false;
    }

    private boolean leave(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.getVehicle() == vehicle) {
                spot.leave();
                return true;
            }
        }
        return false;
    }
 }
