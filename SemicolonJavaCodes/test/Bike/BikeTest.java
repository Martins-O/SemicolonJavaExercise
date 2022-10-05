package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {
    @Test
    public void bikeIsOnTest(){
        //given that I have bike
        Bike martinsBike = new Bike();
        //given that my bike is off
        assertFalse(martinsBike.isOn());
        //when I turn it on
        martinsBike.turnOn();
        //check that it is on
        assertTrue(martinsBike.isOn());
    }
    @Test
    public void bikeIsOffTest(){
        //given that I have Bike
        Bike martinsBike = new Bike();
        //given that my Bike is off
        assertFalse(martinsBike.isOn());
        //when I turn it on
        martinsBike.turnOn();
        //check that it is on
        assertTrue(martinsBike.isOn());
        //when I turn it off
        martinsBike.turnOff();
        //check that it is off
        assertFalse(martinsBike.isOn());
    }
    @Test
    public void bikeWillNotAccelerateWhenBikeIsOffTest() {
        //given that I have Bike
        Bike martinsBike = new Bike();
        //given that my Bike is off
        assertFalse(martinsBike.isOn());

        martinsBike.accelerate();
        assertEquals(0,martinsBike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateOnGearOneTest(){
        Bike martinsBike = new Bike();
        martinsBike.turnOn();
        assertTrue(martinsBike.isOn());

        for (int i = 0; i < 20; i++) {
            martinsBike.accelerate();
        }
        assertEquals("Gear1",martinsBike.getGearType());
        assertEquals(20, martinsBike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateOnGearTwoTest(){
        Bike martinsBike = new Bike();
        martinsBike.turnOn();
        assertTrue(martinsBike.isOn());
//        int count = 0;
//        while(count != 20){
//            martinsBike.accelerate();

        for (int i = 0; i < 20; i++) {
            martinsBike.accelerate();
        }
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        assertEquals("Gear2",martinsBike.getGearType());
        assertEquals(27, martinsBike.getSpeed());
    }

    @Test
    public void bikeCanAccelerateOnGearThreeTest(){
        Bike martinsBike = new Bike();
        martinsBike.turnOn();
        assertTrue(martinsBike.isOn());

        for (int i = 0; i < 20; i++) {
            martinsBike.accelerate();
        }
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        assertEquals("Gear3",martinsBike.getGearType());
        assertEquals(34,martinsBike.getSpeed());
    }
    @Test
    public void bikeCanAccelerateOnGearFourTest(){
        Bike martinsBike = new Bike();
        martinsBike.turnOn();
        assertTrue(martinsBike.isOn());

        for (int i = 0; i < 20; i++) {
            martinsBike.accelerate();
        }
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        assertEquals(47,martinsBike.getSpeed());
    }

    @Test
    public void bikeCanDecelerateFromGearFourTest(){
        Bike martinsBike = new Bike();
        martinsBike.turnOn();
        assertTrue(martinsBike.isOn());

        for (int i = 0; i < 20; i++) {
            martinsBike.accelerate();
        }
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();

        martinsBike.decelerate();
        assertEquals("Gear4", martinsBike.getGearType());
        assertEquals(43,martinsBike.getSpeed());
    }
    @Test
    public void bikeDecelerateOnGearThreeTest(){
        Bike martinsBike = new Bike();
        martinsBike.turnOn();
        assertTrue(martinsBike.isOn());

        for (int i = 0; i < 20; i++) {
            martinsBike.accelerate();
        }
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        assertEquals("Gear3",martinsBike.getGearType());
        assertEquals(31,martinsBike.getSpeed());
    }
    @Test
    public void bikeDecelerateOnGearTwoTest(){
        Bike martinsBike = new Bike();
        martinsBike.turnOn();
        assertTrue(martinsBike.isOn());

        for (int i = 0; i < 20; i++) {
            martinsBike.accelerate();
        }
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        martinsBike.accelerate();
        assertEquals("Gear2",martinsBike.getGearType());
        assertEquals(29,martinsBike.getSpeed());
    }
    @Test
    public void bikeDecelerateOnGearOneTest(){
        Bike martinsBike = new Bike();
        martinsBike.turnOn();
        assertTrue(martinsBike.isOn());

        for (int i = 0; i < 20; i++) {
            martinsBike.accelerate();
        }

          assertEquals("Gear1",martinsBike.getGearType());
        assertEquals(20,martinsBike.getSpeed());
    }


}