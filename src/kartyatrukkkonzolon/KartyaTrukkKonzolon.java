package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukkKonzolon {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*feltolt();
        for (int i = 0; i < 3; i++) {
            //kirak();
            int oszlop = melyik();
            //kever(oszlop);
        }
        ezVolt();*/
    }

    public int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

}
