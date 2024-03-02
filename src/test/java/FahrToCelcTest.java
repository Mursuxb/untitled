package org.example;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class FahrToCelTest {
    // initial method
    @Test
    void convertFahr() {
        int test = (FahrToCel.convertFahr(32));

        assertEquals(0, test);

    }


    // Add in the class demo
    @Test
    void convertCel(){
        int test= (FahrToCel.convertCel(20));
        assertEquals(68,test);
    }

    // Inclass exercise
    @Test
    void convertKel(){
        int test= (FahrToCel.kelvintoCel(273));
        assertEquals(0,test);
    }

    @Test
    void convertKeltoFarTest() {
        double test =Math.round(FahrToCel.kelvinToFah(300.1));
        assertEquals(59.0, test);
    }
}