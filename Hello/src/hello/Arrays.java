package hello;

public class Arrays {

    public static void main(String args[]) {

        /*int[] array1 = new int[4];
        array1[0] = 3;
        array1[1] = 7;
        array1[2] = 4;
        array1[3] = 2;

        int array2[] = {3, 7, 4, 2};
        String[] array3 = {"black", "red", "lime", "blue"};

        String satz = "Heute ist ein schöner Tag zum Programmieren";
        String worte[] = satz.split(" ");
        String kopieWorte[] = worte.clone();
        for (int i = 0; i < kopieWorte.length; i++) {
            System.out.println(kopieWorte[i]);

        }
        System.out.println(kopieWorte.length + " Worte in dem Satz: " + satz);

        int aWert[] = {35, 47, 21};
        float aProz[] = new float[3];
        int summe;

        summe = aWert[0] + aWert[1] + aWert[2];
        aProz[0] = aWert[0] / (float) summe * 100;
        aProz[1] = (float) aWert[1] / summe * 100;
        aProz[2] = aWert[2] / (float) summe * 100;

        System.out.printf("Prozentuale Anteile berechnen\n");
        System.out.println("Wert 1: " + aWert[0] + " => " + aProz[0] + " %");
        System.out.println("Wert 1: " + aWert[1] + " => " + aProz[1] + " %");
        System.out.println("Wert 1: " + aWert[2] + " => " + aProz[2] + " %");

        int arr[] = {8, 5, 3, 7, 4, 6, 2};
        System.out.println("\nAusgabe mit einer Schleife\n");
        for (int i = 0; i < 7; i++) {

            System.out.println(i+" => "+ arr[i]);
        }*/

        float aUmsatz[] = {550.f, 1610.f, 495.f, 5035.f, 11300.f, 999.f};
        float rabSatz;

        System.out.printf("Rabattsatzberechnung\n");
        for (int i = 0; i < 6; i++) {
            if (aUmsatz[i] >= 5000.f) {
                rabSatz = 5.f;
            } else if (aUmsatz[i] >= 2000.f) {
                rabSatz = 3.f;
            } else if (aUmsatz[i] >= 500.f) {
                rabSatz = 2.f;
            } else {
                rabSatz = 0;
            }
            System.out.println(aUmsatz[i]+"\t => "+rabSatz);

        }


    }
}
