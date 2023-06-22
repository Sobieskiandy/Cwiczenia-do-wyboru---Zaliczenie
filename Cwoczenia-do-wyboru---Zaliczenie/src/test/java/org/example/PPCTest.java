package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PPCTest {
    @Test
    void DwaTrzyCzteryPiecDwa()
    {
        PolaPowierzchni PolaPowierzchni = new PolaPowierzchni();
        assertEquals(52, PolaPowierzchni.PPC(2,3,4));
    }
    @Test
    void TrzyCzteryPiecDziewiecCztery()
    {
        PolaPowierzchni PolaPowierzchni = new PolaPowierzchni();
        assertEquals(94, PolaPowierzchni.PPC(3,4,5));
    }
}