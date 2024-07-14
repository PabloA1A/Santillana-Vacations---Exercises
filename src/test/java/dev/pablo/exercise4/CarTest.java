package dev.pablo.exercise4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Seat", 2019, 1.6, FuelType.DIESEL, CarType.FAMILY, 5, 5, 200, Color.RED, false);
    }

    @Test
    void testSetAndGetBrand() {
        car.setBrand("Seat");
        assertEquals("Seat", car.getBrand());
    }

    @Test
    void testSetAndGetModel() {
        car.setModel(2019);
        assertEquals(2019, car.getModel());
    }

    @Test
    void testSetAndGetEngine() {
        car.setEngine(1.6);
        assertEquals(1.6, car.getEngine(), 0.001);
    }

    @Test
    void testSetAndGetFuelType() {
        car.setFuelType(FuelType.DIESEL);
        assertEquals(FuelType.DIESEL, car.getFuelType());
    }

    @Test
    void testSetAndGetCarType() {
        car.setCarType(CarType.FAMILY);
        assertEquals(CarType.FAMILY, car.getCarType());
    }

    @Test
    void testSetAndGetNumberOfDoors() {
        car.setNumberOfDoors(5);
        assertEquals(5, car.getNumberOfDoors());
    }

    @Test
    void testSetAndGetNumberOfSeats() {
        car.setNumberOfSeats(5);
        assertEquals(5, car.getNumberOfSeats());
    }

    @Test
    void testSetAndGetMaxSpeed() {
        car.setMaxSpeed(200);
        assertEquals(200, car.getMaxSpeed());
    }

    @Test
    void testSetAndGetColor() {
        car.setColor(Color.RED);
        assertEquals(Color.RED, car.getColor());
    }

    @Test
    void testSetAndGetCurrentSpeed() {
        car.setCurrentSpeed(80);
        assertEquals(80, car.getCurrentSpeed());
    }

    @Test
    void testSetAndIsAutomatic() {
        car.setAutomatic(false);
        assertFalse(car.isAutomatic());
    }

    @Test
    void testAccelerate() {
        car.accelerate(50);
        assertEquals(50, car.getCurrentSpeed());
    }

    @Test
    void testAccelerateExceedingLimitAndCheckFines() {
        car.accelerate(150);
        car.accelerate(100);
        assertTrue(car.hasFines());
        assertEquals(100, car.totalFineAmount());
        assertEquals(car.getMaxSpeed(), car.getCurrentSpeed());
    }

    @Test
    void testDecelerate() {
        car.accelerate(100);
        car.decelerate(30);
        assertEquals(70, car.getCurrentSpeed());
    }

    @Test
    void testDecelerateToNegative() {
        car.accelerate(50);
        car.decelerate(60);
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    void testBrake() {
        car.accelerate(100);
        car.brake();
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    void testCalculateArrivalTime() {
        car.accelerate(100);
        assertEquals(0.5, car.calculateArrivalTime(50), 0.001);
    }

    @Test
    void testCalculateArrivalTimeWithZeroSpeed() {
        assertThrows(IllegalStateException.class, () -> car.calculateArrivalTime(50));
    }

    @Test
    void testHasFines() {
        assertFalse(car.hasFines());
        car.accelerate(200);
        assertFalse(car.hasFines());
        car.accelerate(10);
        assertTrue(car.hasFines());
    }

    @Test
    void testTotalFineAmount() {
        assertEquals(0, car.totalFineAmount());
        car.accelerate(200);  
        car.accelerate(10);   
        car.accelerate(10);   
        assertEquals(200, car.totalFineAmount());  
    }
}
