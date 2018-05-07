import kaiju.LandBased;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LandBasedTest {

    LandBased landBasedKaiju;

    @Before
    public void before() {
        landBasedKaiju = new LandBased("Godzilla", 100, 25);
    }


    @Test
    public void canRoar() {
        assertEquals("ROAR!", landBasedKaiju.roar());
    }

    @Test
    public void canGetName() {
        assertEquals("Godzilla", landBasedKaiju.getName());
    }

    @Test
    public void canGetHealthValue() {
        assertEquals(100, landBasedKaiju.getHealthValue());
    }

    @Test
    public void canGetAttackValue() {
        assertEquals(25, landBasedKaiju.getAttackValue());
    }

    @Test
    public void canMove() {
        assertEquals("I am moving", landBasedKaiju.move());
    }



}
