package org.example;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class PodatawaTest {
    @Test
    public void DwaDwaCztery()
    {
        Polep Polep = new Polep();
        assertEquals(4, Polep.Podstawa(2,2));
    }
    @Test
    public void DwaZeroZero()
    {
        Polep Polep = new Polep();
        assertEquals(0, Polep.Podstawa(2,0));
    }
}