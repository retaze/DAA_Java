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
        }
        //Rabattsatz
        float aUmsatz[] = {550, 1610, 495, 5035, 11300, 999};
        float rabSatz;

        System.out.printf("Rabattsatzberechnung\n");
        for (int i = 0; i < 6; i++) {
            if (aUmsatz[i] >= 5000) {
                rabSatz = 5;
            } else if (aUmsatz[i] >= 2000) {
                rabSatz = 3;
            } else if (aUmsatz[i] >= 500) {
                rabSatz = 2;
            } else {
                rabSatz = 0;
            }
            System.out.println(aUmsatz[i] + "\t => " + rabSatz);

        }

        //Wochentag
        System.out.println("Test wochenTagName\n");
        for (int nr = 0; nr < 7; nr++) {
            System.out.println(nr + " => " + wochenTagName2(nr));
        }*/

        //Versandkostenberechnung
        String art;
        float kosten;
        float endPreis;
        float wWert[] = {800, 400, 200, 80, 10};

        for (int i = 0; i < 5; i++) {
            if (wWert[i] < 20) {
                kosten = 10;
                art = "Vers.-Ko:";
            } else if (wWert[i] < 100) {
                kosten = 7;
                art = "Vers.-Ko:";
            } else if (wWert[i] < 250) {
                kosten = 4;
                art = "Vers.-Ko:";
            } else if (wWert[i] < 500) {
                kosten = 0;
                art = "";
            } else {
                kosten = (float) (wWert[i] * -0.05);
                art = "Rabatt";
            }
            endPreis = wWert[i] + kosten;
            System.out.println("Warenwert: " + wWert[i] + " - " + art + " = " + kosten + " => " + endPreis);
        }
    }

}

    /*public static String wochenTagName(int nr) {
        String na = "";

        switch (nr) {
            case 0:
                na = "Sonntag";
                break;
            case 1:
                na = "Montag";
                break;
            case 2:
                na = "Dienstag";
                break;
            case 3:
                na = "Mittwoch";
                break;
            case 4:
                na = "Donnerstag";
                break;
            case 5:
                na = "Freitag";
                break;
            case 6:
                na = "Samstag";
                break;
        }
        return na;
    }

    public static String wochenTagName2(int nr) {
        if (nr < 0 || nr > 6) {
            return "";
        }
        String aNa[] = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        return aNa[nr];
    }*/


