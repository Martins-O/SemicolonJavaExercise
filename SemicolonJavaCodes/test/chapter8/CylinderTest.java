package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void testConstructorsIsWorking(){
        Cylinder cylinder = new Cylinder(12,29);
    }
    @Test
    void testThatCheckTheVolume(){
        Cylinder cylinder = new Cylinder(32,34);
        assertEquals(104448.0, cylinder.cylinderVolume(2));
    }
    @Test
    void testSettersAndGetters(){
        Cylinder cylinder = new Cylinder(32,11);
        cylinder.setHeight(23);
        cylinder.setRadius(22);
        assertEquals(22,cylinder.getRadius());
        assertEquals(23, cylinder.getHeight());
    }

}