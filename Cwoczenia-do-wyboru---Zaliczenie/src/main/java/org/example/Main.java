/**
 * Zaimportowano niezbędne pakiety
 */
package org.example;
import java.util.Scanner;
import org.example.Polep;
import org.example.PolaPowierzchni;
import org.example.Sprawdzenie;
import org.example.Objetoscklasa;
import org.example.test;
/**
 * Klasa Main, to tu pobieram dane, wywołuję funkcje i wypisuję dane dla użytkownika.
 */
public class Main {
    public static void main(String[] args)
    {
        /**
         * Tworzę objent scanner by pobrać dane od użytkownika
         * @param x float,
         * @param y float
         * @param z float
         *          Wywołuję test dla wszystkich utworzonych funkcji.
         *          Witam się z użytkownikiem pobieram dane i dokonuję ich sprawdzenia.
         *          W przypadku wykrycia błędnych danych program informuje o nieprawidłowych danych, następuje koniec programu.
         *          W przypadku prawidłowych danych, program wywołuje odpowiednie funkcje i oblicza wymagane zmienne.
         *         @returns Wypisuje pole powierzchni całkowitej oraz pole obliczanego graniastosłupa użytkownikowi, zamykam Scanner dane, kończy program.
         */
        Scanner dane = new Scanner(System.in);
        float x,y,z;
        test objTest = new test ();
        objTest.test1 ();
        System.out.println("Witaj w programie!");
        System.out.println("Program oblicza pole powierzchni calkowitej i objetosc graniastoslupa o podanych przez uzytkownika wymiarach.");
        System.out.println("Podaj pierwsza dlugosc:");
        x = dane.nextFloat();
        System.out.println("Podaj druga dlugosc:");
        y = dane.nextFloat();
        System.out.println("Podaj trzecia dlugosc:");
        z = dane.nextFloat();

        Sprawdzenie obj2 = new Sprawdzenie();
        if(!(obj2.sprawdzenie(x,y,z)))
        {
            System.out.println("Nieprawidlowe dane\n Koniec programu.");
            System.exit(0);

        }
        PolaPowierzchni obj = new PolaPowierzchni();
        Objetoscklasa obj1 = new Objetoscklasa();
        Polep obj3 = new Polep();
        float pole = obj.PPC(x, y, z);
        float objetosc = obj1.OBJ(obj3.Podstawa(x,y), z);

        System.out.println("Pole powierzchni: " + pole);
        System.out.println("Objetosc: " + objetosc);
        dane.close();
    }
}