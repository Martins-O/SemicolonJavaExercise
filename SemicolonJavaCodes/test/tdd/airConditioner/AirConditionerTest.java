package tdd.airConditioner;

import airConditioner.AirConditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    public void airConditionIsOnTest(){
        //Given that I have Ac
        AirConditioner martinsAirCondition = new AirConditioner();
        //given that my AC is off
        assertFalse(martinsAirCondition.isOn());
        //when I turn it on
        martinsAirCondition.turnOn();
        //check if my Ac is On
        assertTrue(martinsAirCondition.isOn());
    }
    @Test
    public void airConditionIsOffTest(){
        //Given that I have AC
        AirConditioner martinsAirCondition = new AirConditioner();
        //Given that my ACis off
        assertFalse(martinsAirCondition.isOn());
        //when I turn it on
        martinsAirCondition.turnOn();
        //check that is on
        assertTrue(martinsAirCondition.isOn());
        //when I turn it off
        martinsAirCondition.turnOff();
        //check that is off
        assertFalse(martinsAirCondition.isOn());
    }
    @Test
    public void increaseTemperatureTest(){
        //given that I have AC
        AirConditioner martinsAirCondition = new AirConditioner();
        //given hat my AC is on
        assertFalse(martinsAirCondition.isOn());
        // when I increase the temperature, My intial temperature ia 16
        martinsAirCondition.increaseTemperature();
        //check that the temperature increase
        assertEquals(17, martinsAirCondition.getTemperature());
    }
    @Test
    public void  decreaseTemperatureTest(){
        //given that I have AC
        AirConditioner martinsAirCondition = new AirConditioner();
        //given hat my AC is On
        assertFalse(martinsAirCondition.isOn());
        // when I decrease the temperature
        martinsAirCondition.decreaseTemperature();
        //check that the temperature decrease
        assertEquals(16, martinsAirCondition.getTemperature());
    }
    @Test
    public void increaseTemperatureBeyondThirty() {
        //Given that I have AC
        AirConditioner martinsAirCondition = new AirConditioner();
        //Given that my AC is on
        assertFalse(martinsAirCondition.isOn());
        // When I increase temperature beyond 30
        int count = 0;
        while (count != 30) {
            martinsAirCondition.increaseTemperature();
            count++;
        }
        // check that the temperature increase
        assertEquals(30, martinsAirCondition.getTemperature());
    }
    @Test
    public void decreaseTemperatureBeyondThirty() {
        //Given that I have AC
        AirConditioner martinsAirCondition = new AirConditioner();
        //Given that my AC is on
        assertFalse(martinsAirCondition.isOn());
        // When I increase temperature beyond 30
        int count = 0;
        while (count != 16) {
            martinsAirCondition.decreaseTemperature();
            count++;
        }
        // check that the temperature increase is
        assertEquals(16, martinsAirCondition.getTemperature());
    }

}