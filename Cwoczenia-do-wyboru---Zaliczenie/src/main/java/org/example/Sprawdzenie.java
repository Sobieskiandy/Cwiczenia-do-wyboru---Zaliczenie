package org.example;
public class Sprawdzenie {
    /**
     * Klasa Sprawdzenie przechowuje funkcję sprawdzenie (sprawdzenie danych wejściowych) dla
     * @param a, float
     * @param b, float
     * @param c, float
     * #returns, booleana, czy dane są mniejsze równe 0
     *
     */
    public boolean sprawdzenie(float a, float b, float c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return false;
        else return true;
    }
}
class Objetoscklasa {
    /**
     * Klasa Objetoscklasa przechowuje funkcję OBJ(Objętość) dla
     * @param a, float, zmienna z wyniku pola podstawy.
     * @param c, float, wysokość graniastosłupa
     * @returns objetość całkowitą graniastosłupa.
     *
     */
    public float OBJ(float a, float c) {
        return a * c;
    }
}
