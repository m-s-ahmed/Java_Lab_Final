// Base Class
class Vehicle {
    // Common attributes
    protected String brand;
    protected String model;
    protected int year;

    // Constructor
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display common vehicle details
    public void displayVehicleDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Derived Class: Car
class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year); // Call the base class constructor
        this.numDoors = numDoors;
    }

    // Overloaded method to display additional car details
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails(); // Call base class method
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Derived Class: Truck
class Truck extends Vehicle {
    private double payloadCapacity; // in tons

    // Constructor
    public Truck(String brand, String model, int year, double payloadCapacity) {
        super(brand, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    // Overloaded method to display additional truck details
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}

// Derived Class: Motorcycle
class Motorcycle extends Vehicle {
    private String engineType;

    // Constructor
    public Motorcycle(String brand, String model, int year, String engineType) {
        super(brand, model, year);
        this.engineType = engineType;
    }

    // Overloaded method to display additional motorcycle details
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Engine Type: " + engineType);
    }
}

// Main Class
public class VehicleHierarchy {
    public static void main(String[] args) {
        // Create objects for each type of vehicle
        Car car = new Car("Toyota", "Corolla", 2020, 4);
        Truck truck = new Truck("Volvo", "FMX", 2019, 18.5);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R15", 2021, "4-stroke");

        // Display details for each vehicle
        System.out.println("Car Details:");
        car.displayVehicleDetails();

        System.out.println("\nTruck Details:");
        truck.displayVehicleDetails();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayVehicleDetails();
    }
}
