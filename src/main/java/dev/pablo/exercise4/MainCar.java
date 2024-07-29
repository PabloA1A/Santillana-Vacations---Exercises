package dev.pablo.exercise4;

import dev.pablo.exercise4.Enumerations.CarType;
import dev.pablo.exercise4.Enumerations.Color;
import dev.pablo.exercise4.Enumerations.FuelType;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car("Seat", 2019, 1.6, FuelType.DIESEL, CarType.FAMILY, 5, 5, 200, Color.RED, false);

        car.accelerate(100);
        car.accelerate(20);
        car.decelerate(50);
        car.brake();

        car.displayAttributes();
        System.out.println("Has fines: " + car.hasFines());
        System.out.println("Total fine Amount: $" + car.totalFineAmount());
    }   
}
