package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SprawdzenieTest {
    @Test
    public boolean DwaDwaCztery()
    {
        Objetoscklasa Objetoscklasa = new Objetoscklasa();
        assertEquals(4, Objetoscklasa.OBJ(2,2));
    }
    @Test
    public boolean DwaZeroZero()
    {
        Objetoscklasa Objetoscklasa = new Objetoscklasa();
        assertEquals(0, Objetoscklasa.OBJ(2,0));
    }

}