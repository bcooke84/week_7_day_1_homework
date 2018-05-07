import kaiju.Kaiju;
import kaiju.LandBased;
import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle1;
    LandBased landBasedKaiju;

    @Before
    public void before() {
        vehicle1 = new Vehicle("Tank", 20);
        landBasedKaiju = new LandBased("Godzilla", 100, 25);
    }

    @Test
    public void canGetType() {
        assertEquals("Tank", vehicle1.getType());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(20, vehicle1.getHealthValue());
    }

    @Test
    public void canFireMissle() {
        assertEquals("Direct hit!", vehicle1.missileAttack(landBasedKaiju));
    }

    @Test
    public void canFireGun() {
        assertEquals("Ready, aim, fire!", vehicle1.gunAttack(landBasedKaiju));
    }

}
