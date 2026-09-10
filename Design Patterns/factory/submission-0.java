interface Vehicle {
    String getType();
}

class Car implements Vehicle {
    @Override
    public String getType() {
        return "Car";
    }
}

class Bike implements Vehicle {
    @Override
    public String getType() {
        return "Bike";
    }
}

class Truck implements Vehicle {
    @Override
    public String getType() {
        return "Truck";
    }
}

abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    // Write your code here
    Vehicle createVehicle(){
        Car a=new Car();
        return a;
    }
}

class BikeFactory extends VehicleFactory {
    // Write your code here
    Vehicle createVehicle(){
        Vehicle a=new Bike();
        return a;
    }
}

class TruckFactory extends VehicleFactory {
    // Write your code here
    Vehicle createVehicle(){
        Vehicle a=new Truck();
        return a;
    }
}
