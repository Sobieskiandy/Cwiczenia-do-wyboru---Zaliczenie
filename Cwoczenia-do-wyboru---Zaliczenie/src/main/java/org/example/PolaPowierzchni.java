package org.example;
import org.example.Polep;
public class PolaPowierzchni {
    /**
     * Klasa PolaPowierzchni przechowuje funkcję PPC(pole powierzchni całkowitej) dla
     * @param a, float
     * @param b, float
     * @param c, float
     *           przy wowołaniu funkcji Podstawa(), dla obliczenia Pola powierzchni ścian graniastosłupa.
     * @returns pole powierzchni całkowitej
     *
     */
    public float PPC(float a, float b, float c) {
        Polep obj = new Polep();
        return 2 * obj.Podstawa(a,b) + 2 * obj.Podstawa(b,c) + 2 * obj.Podstawa(c,a);
    }
}

class Polep {
    /**
     * Klasa Polep przechowuje funkcję Podstawa(Graniastosłupa) dla
     * @param a, float
     * @param b, float
     * @returns pole powierzchni podstawy
     *
     */
    public float Podstawa(float a, float b) {
        return a * b;
    }
}