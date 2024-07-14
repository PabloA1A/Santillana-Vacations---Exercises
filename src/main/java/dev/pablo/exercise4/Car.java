package dev.pablo.exercise4;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private int model;
    private double engine;
    private FuelType fuelType;
    private CarType carType;
    private int numberOfDoors;
    private int numberOfSeats;
    private int maxSpeed;
    private Color color;
    private int currentSpeed;
    private boolean isAutomatic;
    private List<Fine> fines;

    public Car(String brand, int model, double engine, FuelType fuelType, CarType carType, int numberOfDoors,
            int numberOfSeats, int maxSpeed, Color color, boolean isAutomatic) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.currentSpeed = 0;
        this.fines = new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean isAutomatic) {
        this.isAutomatic = isAutomatic;
    }

    public List<Fine> getFines() {
        return fines;
    }

    public void setFines(List<Fine> fines) {
        this.fines = fines;
    }

    public void accelerate(int speed) {
        if (this.currentSpeed + speed > this.maxSpeed) {
            System.out.println("Cannot exceed the maximum speed of " + maxSpeed + " km/h");
            fines.add(new Fine(100)); 
            currentSpeed = maxSpeed;
        } else {
            currentSpeed += speed;
        }
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }

    public void decelerate(int decrement) {
        if (currentSpeed - decrement < 0) {
            System.out.println("Speed cannot be negative");
            currentSpeed = 0;
        } else {
            currentSpeed -= decrement;
        }
        System.out.println("Current speed: " + currentSpeed + " km/h");
    }

    public void brake() {
        currentSpeed = 0;
        System.out.println("The vehicle has stopped. Current speed: 0 km/h");
    }

    public double calculateArrivalTime(int distance) {
        if (currentSpeed == 0) {
            throw new IllegalStateException("The vehicle is stopped");
        }
        return (double) distance / currentSpeed;
    }

    public void displayAttributes() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine + " L");
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Car type: " + carType);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Max speed: " + maxSpeed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Current speed: " + currentSpeed + " km/h");
        System.out.println("Automatic: " + isAutomatic);
    }

    public boolean hasFines() {
        return !fines.isEmpty();
    }

    public double totalFineAmount() {
        return fines.stream().mapToDouble(Fine::getAmount).sum();
    }
}
