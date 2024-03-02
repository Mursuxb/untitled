import T1.FahrToCelc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FahrToCelcTest {
    @Test
    public void testFahrToCelc() {
        FahrToCelc ftc = new FahrToCelc();
        assertEquals(0.0, ftc.fahrToCelc(32.0), 0.0001);
        assertEquals(100.0, ftc.fahrToCelc(212.0), 0.0001);
        assertEquals(-40.0, ftc.fahrToCelc(-40.0), 0.0001);
    }
    @Test
    public void testKelvintoCel() {
        assertEquals(0.0, FahrToCelc.kelvintoCel((float) 273.15), 0.0001);
        assertEquals(-273.15, FahrToCelc.kelvintoCel(0), 0.0001);
        assertEquals(100.0, FahrToCelc.kelvintoCel((float) 373.15), 0.0001);
    }
    @Test
    public void testKelvintoFahr() {
        assertEquals(32.0, FahrToCelc.kelvintoFahr((float) 273.15), 0.0001);
        assertEquals(-241.1499, FahrToCelc.kelvintoFahr(0), 0.0001);
        assertEquals(132.0, FahrToCelc.kelvintoFahr((float) 373.15), 0.0001);
    }
}
