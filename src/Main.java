import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[][] kinosaal = new double[10][13];
        kinosaal[4] = new double[9];
        kinosaal[5] = new double[9];

        double vortag = Math.random() * 50;
        for (int monat = 0; monat < kinosaal.length; monat++) {
            for (int tag = 0; tag < kinosaal[monat].length; tag++) {
                kinosaal[monat][tag] = vortag;
                vortag = vortag + Math.random() * 20 - 10;
            }
        }

        System.out.print(Arrays.deepToString(kinosaal));
    }
}