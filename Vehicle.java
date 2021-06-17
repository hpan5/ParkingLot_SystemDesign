public abstract class Vehicle {
    public abstract VehicleSize getSize();
}

public class Car extends Vehicle {
    @java.lang.Override
    public VehicleSize getSize() {
        return VehicleSize.Compact;
    }
}

public class Truck extends  Vehicle {
    @java.lang.Override
    public VehicleSize getSize() {
        return VehicleSize.Large;
    }
}

