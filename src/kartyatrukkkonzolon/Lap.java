package kartyatrukkkonzolon;

public class Lap {

    private String[] aPakli = new String[22];

    public Lap() {
        feltoltPaklit();
    }

    private void feltoltPaklit() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int index = 1;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                aPakli[index++] = szin + "_" + ertek;
            }
        }
    }

    public String[] getPakli() {
        return aPakli;
    }


}
