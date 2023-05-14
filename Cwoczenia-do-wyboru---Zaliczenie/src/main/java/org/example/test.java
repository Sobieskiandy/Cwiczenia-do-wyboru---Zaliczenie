package org.example;
import org.example.*;
public class test {
    /**
     * Klasa test przechowuje funkcję test1, która sprawdza poprawność wykonywanych obliczeń funkcji PPC(), Podstawa(),
     * Sprawdzenie() i OBJ().
     * Planowałem użyć do tego biblioteki Junit(umieszczona w Mavenie), jednak przy jej użyciu występowały liczne błędy, które uniemożliwiały uruchomienie programu.
     */
    public void test1() {
        System.out.println("---TEST---");
        PolaPowierzchni obj = new PolaPowierzchni();
        if (obj.PPC(2, 3, 4) == 52) {
             System.out.println("PPC() dziala");
        } else {
            System.out.println("PPC() nie dziala");
        }
        Polep obj1 = new Polep();
        if (obj1.Podstawa(2, 3) == 6) {
                  System.out.println("Podstawa() dziala");
            } else {
            System.out.println("Podstawa() nie dziala");
        }
        Sprawdzenie obj2 = new Sprawdzenie();
        if (obj2.sprawdzenie(2, 3, 4)) {
            System.out.println("Sprawdzenie() dziala");
        } else {
            System.out.println("Sprawdzenie() nie dziala");
        }
        Objetoscklasa obj3 = new Objetoscklasa();
        if (obj3.OBJ(2, 3)==6) {
            System.out.println("OBJ() dziala");
        } else {
            System.out.println("OBJ() nie dziala");
        }

            System.out.println("---TEST---");

    }
}