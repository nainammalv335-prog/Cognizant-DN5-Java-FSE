interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a Car");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a Bike");
    }
}

class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        return null;
    }
}

public class FactoryMethodPattern {

    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getVehicle("Car");
        car.drive();

        Vehicle bike = VehicleFactory.getVehicle("Bike");
        bike.drive();
    }
}
