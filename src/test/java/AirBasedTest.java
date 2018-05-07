import kaiju.AirBased;
import kaiju.LandBased;
import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;

import static org.junit.Assert.assertEquals;

public class AirBasedTest {

    AirBased airBasedKaiju;
    Vehicle vehicle;

    @Before
    public void before() {
        airBasedKaiju = new AirBased("Mothra", 75, 5);
        vehicle = new Vehicle("Tank", 50);
    }

    @Test
    public void canRoar() {
        assertEquals("ROAR!", airBasedKaiju.roar());
    }

    @Test
    public void canGetName() {
        assertEquals("Mothra", airBasedKaiju.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(75, airBasedKaiju.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(5, airBasedKaiju.getAttackValue());
    }

    @Test
    public void canFly() {
        assertEquals("I am flying", airBasedKaiju.fly());
    }

//    @Test
//    public void canAttack() {
//        airBasedKaiju.attack(vehicle);
//        assertEquals();
//    }


}
