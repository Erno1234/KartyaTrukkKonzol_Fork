package nezet;

import java.util.Scanner;
import modell.Pakli;

public class KartyaTrukkKonzolon {

    private static Scanner scr;
    Pakli pakli = new Pakli();
    
    
    
    public KartyaTrukkKonzolon() {
        KartyaTrukkKonzolon.scr = new Scanner(System.in);
        indit();
    }
    
    private int melyik(){
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = scr.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }
    
    public void indit(){
        for (int i = 0; i < 3; i++) {
            pakli.kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        pakli.ezVolt();
    }

}
