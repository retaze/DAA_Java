package hello;

public class AssoziativArrayFehltage {

    public static void main(String args[]) {

        Fehlsumme fsu[] = new Fehlsumme[50];
        Fehltage ft[] = new Fehltage[5];

        ft[0] = new Fehltage();
        ft[1] = new Fehltage();
        ft[2] = new Fehltage();
        ft[3] = new Fehltage();
        ft[4] = new Fehltage();


        ft[0].maNr = 35;
        ft[0].vonDatum = "03.01.2011";
        ft[0].bisDatum = "07.01.2011";
        ft[0].grund = "Krank";
        ft[0].anzTage = 5;
        ft[1].maNr = 35;
        ft[1].vonDatum = "24.01.2011";
        ft[1].bisDatum = "04.02.2011";
        ft[1].grund = "Urlaub";
        ft[1].anzTage = 10;
        ft[2].maNr = 42;
        ft[2].vonDatum = "08.02.2011";
        ft[2].bisDatum = "09.02.2011";
        ft[2].grund = "Urlaub";
        ft[2].anzTage = 2;
        ft[3].maNr = 45;
        ft[3].vonDatum = "14.02.2011";
        ft[3].bisDatum = "23.02.2011";
        ft[3].grund = "Krank";
        ft[3].anzTage = 8;
        ft[4].maNr = 35;
        ft[4].vonDatum = "21.03.2011";
        ft[4].bisDatum = "29.03.2011";
        ft[4].grund = "Urlaub";
        ft[4].anzTage = 7;

        for (int i = 0; i < 5; i++) {
            if (fsu[ft[i].maNr] == null) {
                fsu[ft[i].maNr] = new Fehlsumme();
            }
            if (ft[i].grund.equals("Urlaub")) {
                fsu[ft[i].maNr].suUrlaub += ft[i].anzTage;

            } else {
                fsu[ft[i].maNr].suKrank += ft[i].anzTage;
            }
        }
        for (int i = 0; i < 50; i++) {
            if (fsu[i] != null) {

                System.out.println("MANr: " + i + ": Urlaub: " + fsu[i].suUrlaub + ", Krank: " + fsu[i].suKrank);
            }
        }


    }

    public static class Fehltage {

        int maNr, anzTage;
        String vonDatum, bisDatum, grund;


    }

    public static class Fehlsumme {

        int suUrlaub = 0, suKrank = 0;

    }
}
