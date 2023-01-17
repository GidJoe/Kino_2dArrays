import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[][] kinosaal = new double[10][16];
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

        for (int r = 0; i < kinosaal.length; i++) {
            for (int p = 0; p < kinosaal[p].length; p++)
                if (kinosaal[i][p] == 1) {
                    dreier++;
                    ausgabe+="[x]";
                } else {ausgabe+="[__]";}

            if (dreier == 3) {
                dreierfrei++;
                dreier = 0;
            }

        }

        System.out.print(Arrays.toString(kinosaal[2]));
        System.out.print(ausgabe);
        System.out.print(dreierfrei);
    }
}