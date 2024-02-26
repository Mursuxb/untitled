package laskin;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ExtraTest extends AbstractParent {

    private static Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeAll
    public static void testVirtaON() {
        System.out.println("@BeforeAll Virta ON (ennen ensimmäistä testiä)");
        laskin.virtaON();
    }

    @AfterAll
    public static void testVirtaOFF() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        assertEquals(0.0, laskin.annaTulos(), DELTA, "Nollaus ei onnistunut");
    }

    @Test
    public void testNelio2() {
        laskin.nelio(2);
        assertEquals(4.0, laskin.annaTulos(), DELTA, "Luvun 2 Neliöön korotus väärin");
    }

    @Test
    public void testNelio4() {
        laskin.nelio(4);
        assertEquals(16.0, laskin.annaTulos(), DELTA, "Luvun 4 neliöön korotus väärin");
    }

    @Test
    public void testNelio5() {
        laskin.nelio(5);
        assertEquals(25.0, laskin.annaTulos(), DELTA, "Luvun 5 neliöön korotus väärin");
    }

    @Test
    public void testNeliojuuri2() {
        laskin.neliojuuri(2);
        assertEquals(1.414, laskin.annaTulos(), DELTA, "Neliöjuuri luvusta 2 väärin");
    }

    @Test
    @DisplayName("Testaa negatiivinen neliöjuuri")
    public void testNeliojuuriNegat() {
        ArithmeticException poikkeus = assertThrows(ArithmeticException.class, () -> laskin.neliojuuri(-1));
        assertEquals("Negatiiviselle luvulle ei voi laskea neliöjuurta", poikkeus.getMessage());
    }
}
