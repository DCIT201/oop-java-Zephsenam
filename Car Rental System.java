# Vehicle.java

/**
 * Represents a vehicle with basic attributes and behaviors.
 */
public abstract class Vehicle {
    private String id;
    private String make;
    private String model;
    private double dailyRate;
    private boolean isRented;

    /**
     * Constructs a new Vehicle object.
     *
     * @param id         Unique vehicle ID
     * @param make       Vehicle make
     * @param model      Vehicle model
     * @param dailyRate  Daily rental rate
     */
    public Vehicle(String id, String make, String model, double dailyRate) {
        (link unavailable) = id;
        this.make = make;
        this.model = model;
        this.dailyRate = dailyRate;
        this.isRented = false;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    // Abstract methods
    public abstract double calculateRentalCost(int days);

    public abstract void rentVehicle();

    public abstract void returnVehicle();

    @Override
    public String toString() {
        return "Vehicle ID: " + id + ", Make: " + make + ", Model: " + model + ", Daily Rate: " + dailyRate + ", Rented: " + isRented;
    }
}


# Car.java

/**
 * Represents a car with specific attributes and behaviors.
 */
public class Car extends Vehicle {
    private int numDoors;
    private boolean hasSunroof;

    /**
     * Constructs a new Car object.
     *
     * @param id         Unique vehicle ID
     * @param make       Vehicle make
     * @param model      Vehicle model
     * @param dailyRate  Daily rental rate
     * @param numDoors   Number of doors
     * @param hasSunroof Whether the car has a sunroof
     */
    public Car(String id, String make, String model, double dailyRate, int numDoors, boolean hasSunroof) {
        super(id, make, model, dailyRate);
        this.numDoors = numDoors;
        this.hasSunroof = hasSunroof;
    }

    // Getters and setters
    public int getNumDoors() {
        return numDoors;
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    // Implement abstract methods
    @Override
    public double calculateRentalCost(int days) {
        // Additional charge for sunroof
        return getDailyRate() * days * (hasSunroof ? 1.1 : 1);
    }

    @Override
    public void rentVehicle() {
        setRented(true);
        System.out.println("Car rented successfully!");
    }

    @Override
    public void returnVehicle() {
        setRented(false);
        System.out.println("Car returned successfully!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Number of Doors: " + numDoors + ", Sunroof: " + hasSunroof;
    }
}


# Motorcycle.java

/**
 * Represents a motorcycle with specific attributes and behaviors.
 */
public class Motorcycle extends Vehicle {
    private int engineCapacity;

    /**
     * Constructs a new Motorcycle object.
     *
     * @param id         Unique vehicle ID
     * @param make       Vehicle make
     * @param model      Vehicle model
     * @param dailyRate  Daily rental rate
     * @param engineCapacity Engine capacity in CC
     */
    public Motorcycle(String id, String make, String model, double dailyRate, int engineCapacity) {
        super(id, make, model, dailyRate);
        this.engineCapacity = engineCapacity;
    }

    // Getters and setters
    public int getEngineCapacity() {
        return engineCapacity;
    }

    // Implement abstract methods
    @Override
    public double calculateRentalCost(int days) {
        // Additional charge for high-capacity engines
        return getDailyRate() * days * (engineCapacity > 650 ? 1.2 : 1);
    }

    @Override
    public void rentVehicle() {
        setRented(true);
        System.out.println("Motorcycle rented successfully!");
    }

    @Override
    public void returnVehicle() {
        setRented(false);
        System.out.println("Motorcycle returned successfully!");
    }

    @Override
    public String toString() {
        return super.toString() +