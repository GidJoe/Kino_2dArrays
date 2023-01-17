import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[][] kinosaal = new double[10][14];
        kinosaal[4] = new double[10];
        kinosaal[5] = new double[10];

        double vortag = Math.random() * 50;
        for (int monat = 0; monat < kinosaal.length; monat++) {
            for (int tag = 0; tag < kinosaal[monat].length; tag++) {
                kinosaal[monat][tag] = vortag;
                vortag = vortag + Math.random() * 20 - 10;
                if (vortag > 1) vortag = 1;
                if (vortag < 1) vortag = 0;
            }
        }

        int dreier = 0;
        int dreierfrei = 0;
        String ausgabe = "";

        for (int reihe = 0; reihe < kinosaal.length; reihe++) {
            for (int sitz = 0; sitz < kinosaal[reihe].length; sitz++) {
                if (kinosaal[reihe][sitz] == 1) {
                    dreier++;
                    ausgabe += " [x] \t";
                } else {
                    ausgabe += " [__] \t";
                    dreier = 0;
                }

                if (dreier == 3) {
                    dreier = 0;
                    dreierfrei++;

                }

            }

            ausgabe += "\n";

        }
        String neueAusgabe = ausgabe.replace("[x] \t [x] \t [x]", "[Macho] \t");


        System.out.println(neueAusgabe);
        System.out.println("Es sind " + dreierfrei + " Machoplätze frei");

    }
}

