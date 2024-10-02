package org.launchcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: add emptyTest so we can configure our runtime environment
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
    }
    //TODO: constructor sets gasTankLevel properly
    Car test_car;

    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    @Test
    public void testInitialGasTank() {
//        Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(),.001 );
    }

    @Test
    public void testInitialGasTank1() {

        assertFalse(test_car.getGasTankLevel()<0);
    }
    @Test
    public void testInitialGasTank2() {

        assertTrue(test_car.getGasTankLevel() == test_car.getGasTankSize());
    }


    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}