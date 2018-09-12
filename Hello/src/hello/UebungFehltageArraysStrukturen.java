package hello;

public class UebungFehltageArraysStrukturen {

    public static void main(String args[]) {

        int summe;

        Fehltage ft1 = new Fehltage();
        Fehltage ft2 = new Fehltage();

        ft1.maNr = 35;
        ft1.vonDatum = "03.01.2011";
        ft1.bisDatum = "07.01.2011";
        ft1.grund = "Krank";
        ft1.anzTage = 5;
        ft2.maNr = 35;
        ft2.vonDatum = "24.01.2011";
        ft2.bisDatum = "04.02.2011";
        ft2.grund = "Urlaub";
        ft2.anzTage = 10;

        System.out.println("Fehltage: \n");
        System.out.println(ft1.maNr + ": " + ft1.vonDatum + " - " + ft1.grund);
        System.out.println(ft2.maNr + ": " + ft2.vonDatum + " - " + ft2.grund);
        summe = ft1.anzTage + ft2.anzTage;
        System.out.println("Summe der Fehltage: "+summe);

    }

    public static class Fehltage {
        int maNr;
        String vonDatum;
        String bisDatum;
        String grund;
        int anzTage;
    }

}
