public class ParkingLot {
    priavte Level[] levels;
    boolean park(Vehicle v);
    boolean leave(Vehicle v);

    /** given a veihicle, tell me whether I can park it?*/
    public boolean hasSpot(Vehicle v) {
        //TODO: check each level, for each level, call Level #hasSpot(Vehicle)
    }
}

class Level {
    //tracking Parking Spots
    //boolean hasSpot(Vehicle)
}

class ParkingSpot{
   //boolean fit(Vehicle): check size and availability
}

public abstract class Vehicle {
    //data fields ...
    //getSize() method
}

