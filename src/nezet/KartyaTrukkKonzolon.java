package nezet;

import java.util.Scanner;
import modell.Pakli;

public final class KartyaTrukkKonzolon {

    private static Scanner scr;
    Pakli pakli = new Pakli();

    public void pakliFormazKiir(String[] kartyaPakli) {
        for (int i = 1; i < kartyaPakli.length; i++) {
            System.out.printf("%-8s", kartyaPakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    public KartyaTrukkKonzolon() {
        KartyaTrukkKonzolon.scr = new Scanner(System.in);
        indit();
        System.out.printf("Választott lap: %s\n", pakli.ezVolt());
    }

    private int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = scr.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

    public void indit() {
        for (int i = 0; i < 3; i++) {
            String[] kartyaPakli = pakli.kirak();
            pakliFormazKiir(kartyaPakli);
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        pakli.ezVolt();
    }

}
