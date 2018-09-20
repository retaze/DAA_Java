package hello;

public class FahrzeuglisteA {

    public static class Fahrzeugliste {

        int fzNr, ps, km;
        String hersteller, typ, ausfuehrung, ez;
        double preis;

    }


    public static void main(String args[]) {

        Fahrzeugliste fahrzeuge[] = new Fahrzeugliste[18];

        fahrzeuge[0] = new Fahrzeugliste();
        fahrzeuge[1] = new Fahrzeugliste();
        fahrzeuge[2] = new Fahrzeugliste();
        fahrzeuge[3] = new Fahrzeugliste();
        fahrzeuge[4] = new Fahrzeugliste();
        fahrzeuge[5] = new Fahrzeugliste();
        fahrzeuge[6] = new Fahrzeugliste();
        fahrzeuge[7] = new Fahrzeugliste();
        fahrzeuge[8] = new Fahrzeugliste();
        fahrzeuge[9] = new Fahrzeugliste();
        fahrzeuge[10] = new Fahrzeugliste();
        fahrzeuge[11] = new Fahrzeugliste();
        fahrzeuge[12] = new Fahrzeugliste();
        fahrzeuge[13] = new Fahrzeugliste();
        fahrzeuge[14] = new Fahrzeugliste();
        fahrzeuge[15] = new Fahrzeugliste();
        fahrzeuge[16] = new Fahrzeugliste();
        fahrzeuge[17] = new Fahrzeugliste();

        fahrzeuge[0].fzNr = 150012;
        fahrzeuge[0].hersteller = "Fiat";
        fahrzeuge[0].typ = "Panda";
        fahrzeuge[0].ausfuehrung = "Cross";
        fahrzeuge[0].ps = 34;
        fahrzeuge[0].ez = "13.09.2012";
        fahrzeuge[0].km = 19256;
        fahrzeuge[0].preis = 5275;
        fahrzeuge[1].fzNr = 150013;
        fahrzeuge[1].hersteller = "Opel";
        fahrzeuge[1].typ = "Corsa";
        fahrzeuge[1].ausfuehrung = "Free";
        fahrzeuge[1].ps = 60;
        fahrzeuge[1].ez = "15.07.2009";
        fahrzeuge[1].km = 25894;
        fahrzeuge[1].preis = 8000;
        fahrzeuge[2].fzNr = 150014;
        fahrzeuge[2].hersteller = "Fiat";
        fahrzeuge[2].typ = "Stylo";
        fahrzeuge[2].ausfuehrung = "Sport";
        fahrzeuge[2].ps = 103;
        fahrzeuge[2].ez = "28.12.2013";
        fahrzeuge[2].km = 9583;
        fahrzeuge[2].preis = 7500;
        fahrzeuge[3].fzNr = 150015;
        fahrzeuge[3].hersteller = "Ford";
        fahrzeuge[3].typ = "Focus";
        fahrzeuge[3].ausfuehrung = "Sprint";
        fahrzeuge[3].ps = 90;
        fahrzeuge[3].ez = "08.05.2010";
        fahrzeuge[3].km = 16889;
        fahrzeuge[3].preis = 16400;
        fahrzeuge[4].fzNr = 150016;
        fahrzeuge[4].hersteller = "Porsche";
        fahrzeuge[4].typ = "927";
        fahrzeuge[4].ausfuehrung = "XXL";
        fahrzeuge[4].ps = 324;
        fahrzeuge[4].ez = "14.09.2010";
        fahrzeuge[4].km = 3258;
        fahrzeuge[4].preis = 30000;
        fahrzeuge[5].fzNr = 150017;
        fahrzeuge[5].hersteller = "Fiat";
        fahrzeuge[5].typ = "Stylo";
        fahrzeuge[5].ausfuehrung = "Sport";
        fahrzeuge[5].ps = 157;
        fahrzeuge[5].ez = "11.11.2011";
        fahrzeuge[5].km = 120589;
        fahrzeuge[5].preis = 10800;
        fahrzeuge[6].fzNr = 150018;
        fahrzeuge[6].hersteller = "Porsche";
        fahrzeuge[6].typ = "911";
        fahrzeuge[6].ausfuehrung = "XL";
        fahrzeuge[6].ps = 354;
        fahrzeuge[6].ez = "01.05.1993";
        fahrzeuge[6].km = 25000;
        fahrzeuge[6].preis = 59300.55;
        fahrzeuge[7].fzNr = 150019;
        fahrzeuge[7].hersteller = "Opel";
        fahrzeuge[7].typ = "Manta";
        fahrzeuge[7].ausfuehrung = "Super 3l";
        fahrzeuge[7].ps = 174;
        fahrzeuge[7].ez = "08.08.1972";
        fahrzeuge[7].km = 154258;
        fahrzeuge[7].preis = 10000;
        fahrzeuge[8].fzNr = 150020;
        fahrzeuge[8].hersteller = "Ford";
        fahrzeuge[8].typ = "Fiesta";
        fahrzeuge[8].ausfuehrung = "Pinta";
        fahrzeuge[8].ps = 54;
        fahrzeuge[8].ez = "02.01.2015";
        fahrzeuge[8].km = 10;
        fahrzeuge[8].preis = 13250;
        fahrzeuge[9].fzNr = 150021;
        fahrzeuge[9].hersteller = "Ford";
        fahrzeuge[9].typ = "Fiesta";
        fahrzeuge[9].ausfuehrung = "Pinta";
        fahrzeuge[9].ps = 54;
        fahrzeuge[9].ez = "02.01.2015";
        fahrzeuge[9].km = 24;
        fahrzeuge[9].preis = 13250;
        fahrzeuge[10].fzNr = 150022;
        fahrzeuge[10].hersteller = "Ford";
        fahrzeuge[10].typ = "Focus";
        fahrzeuge[10].ausfuehrung = "Hallo";
        fahrzeuge[10].ps = 128;
        fahrzeuge[10].ez = "10.06.2011";
        fahrzeuge[10].km = 68000;
        fahrzeuge[10].preis = 14500;
        fahrzeuge[11].fzNr = 150023;
        fahrzeuge[11].hersteller = "Opel";
        fahrzeuge[11].typ = "Popel";
        fahrzeuge[11].ausfuehrung = "Z4";
        fahrzeuge[11].ps = 42;
        fahrzeuge[11].ez = "31.10.2012";
        fahrzeuge[11].km = 10005;
        fahrzeuge[11].preis = 5000.48;
        fahrzeuge[12].fzNr = 150024;
        fahrzeuge[12].hersteller = "Mercedes";
        fahrzeuge[12].typ = "SLS";
        fahrzeuge[12].ausfuehrung = "AMG";
        fahrzeuge[12].ps = 568;
        fahrzeuge[12].ez = "25.04.2012";
        fahrzeuge[12].km = 33451;
        fahrzeuge[12].preis = 98000;
        fahrzeuge[13].fzNr = 150025;
        fahrzeuge[13].hersteller = "Vespa";
        fahrzeuge[13].typ = "V5";
        fahrzeuge[13].ausfuehrung = "Roller";
        fahrzeuge[13].ps = 5;
        fahrzeuge[13].ez = "21.12.2000";
        fahrzeuge[13].km = 5865;
        fahrzeuge[13].preis = 800;
        fahrzeuge[14].fzNr = 150026;
        fahrzeuge[14].hersteller = "Honda";
        fahrzeuge[14].typ = "Z50";
        fahrzeuge[14].ausfuehrung = "Kleinkraftrad";
        fahrzeuge[14].ps = 13;
        fahrzeuge[14].ez = "05.06.2005";
        fahrzeuge[14].km = 8565;
        fahrzeuge[14].preis = 1850;
        fahrzeuge[15].fzNr = 150027;
        fahrzeuge[15].hersteller = "Mercedes";
        fahrzeuge[15].typ = "C200";
        fahrzeuge[15].ausfuehrung = "Basic";
        fahrzeuge[15].ps = 98;
        fahrzeuge[15].ez = "24.09.2009";
        fahrzeuge[15].km = 125000;
        fahrzeuge[15].preis = 2200;
        fahrzeuge[16].fzNr = 150028;
        fahrzeuge[16].hersteller = "Ford";
        fahrzeuge[16].typ = "Focus";
        fahrzeuge[16].ausfuehrung = "Bye";
        fahrzeuge[16].ps = 90;
        fahrzeuge[16].ez = "05.06.2007";
        fahrzeuge[16].km = 51256;
        fahrzeuge[16].preis = 10589.25;
        fahrzeuge[17].fzNr = 150523;
        fahrzeuge[17].hersteller = "Mercedes";
        fahrzeuge[17].typ = "SLS";
        fahrzeuge[17].ausfuehrung = "AMG";
        fahrzeuge[17].ps = 452;
        fahrzeuge[17].ez = "25.02.2012";
        fahrzeuge[17].km = 80052;
        fahrzeuge[17].preis = 98000;

        int laenge[] = new int[8];

        int pos1 = 0;
        for (int i = 1; i <= 17; i++) {
            if (String.valueOf(fahrzeuge[pos1].fzNr).length() == String.valueOf(fahrzeuge[i].fzNr).length()) {
                laenge[0] = String.valueOf(fahrzeuge[pos1].fzNr).length();
            }
            if (String.valueOf(fahrzeuge[pos1].fzNr).length() < String.valueOf(fahrzeuge[i].fzNr).length()) {
                pos1 = i;
                laenge[0] = String.valueOf(fahrzeuge[pos1].fzNr).length();
            }
        }
        int pos2 = 0;
        for (int i = 1; i <= 17; i++) {
            if (fahrzeuge[pos2].hersteller.length() < fahrzeuge[i].hersteller.length()) {
                pos2 = i;
                laenge[1] = fahrzeuge[pos2].hersteller.length();
            }
        }
        int pos3 = 0;
        for (int i = 1; i <= 17; i++) {
            if (fahrzeuge[pos3].typ.length() < fahrzeuge[i].typ.length()) {
                pos3 = i;
                laenge[2] = fahrzeuge[pos3].typ.length();
            }
        }
        int pos4 = 0;
        for (int i = 1; i <= 17; i++) {
            if (fahrzeuge[pos4].ausfuehrung.length() < fahrzeuge[i].ausfuehrung.length()) {
                pos4 = i;
                laenge[3] = fahrzeuge[pos4].ausfuehrung.length();
            }
        }
        int pos5 = 0;
        for (int i = 1; i <= 17; i++) {
            if (String.valueOf(fahrzeuge[pos5].ps).length() == String.valueOf(fahrzeuge[i].ps).length()) {
                laenge[4] = String.valueOf(fahrzeuge[pos5].ps).length();
            }
            if (String.valueOf(fahrzeuge[pos5].ps).length() < String.valueOf(fahrzeuge[i].ps).length()) {
                pos5 = i;
                laenge[4] = String.valueOf(fahrzeuge[pos5].ps).length();
            }
        }
        int pos6 = 0;
        for (int i = 1; i <= 17; i++) {
            if (fahrzeuge[pos6].ez.length() == fahrzeuge[i].ez.length()) {
                laenge[5] = fahrzeuge[pos6].ez.length();
            }
            if (fahrzeuge[pos6].ez.length() < fahrzeuge[i].ez.length()) {
                pos6 = i;
                laenge[5] = fahrzeuge[pos6].ez.length();
            }
        }
        int pos7 = 0;
        for (int i = 1; i <= 17; i++) {
            if (String.valueOf(fahrzeuge[pos7].km).length() == String.valueOf(fahrzeuge[i].km).length()) {
                laenge[6] = String.valueOf(fahrzeuge[pos7].km).length();
            }
            if (String.valueOf(fahrzeuge[pos7].km).length() < String.valueOf(fahrzeuge[i].km).length()) {
                pos7 = i;
                laenge[6] = String.valueOf(fahrzeuge[pos7].km).length();
            }
        }
        int pos8 = 0;
        for (int i = 1; i <= 17; i++) {
            if (String.valueOf(fahrzeuge[pos8].preis).length() == String.valueOf(fahrzeuge[i].preis).length()) {
                laenge[7] = String.valueOf(fahrzeuge[pos8].preis).length();
            }
            if (String.valueOf(fahrzeuge[pos8].preis).length() < String.valueOf(fahrzeuge[i].preis).length()) {
                pos8 = i;
                laenge[7] = String.valueOf(fahrzeuge[pos8].preis).length();
            }
        }

        System.out.println("Anzahl der Zeichen des laengsten Eintrages jeder Spalte: " + laenge[0] + ", " + laenge[1] + ", " + laenge[2] + ", " + laenge[3] + ", " + laenge[4] + ", " + laenge[5] + ", " + laenge[6] + ", " + laenge[7]);

        double bestandwert = 0;

        for (int i = 0; i < 18; i++) {


            int leer;
            leer = laenge[0] - String.valueOf(fahrzeuge[i].fzNr).length() + 1;
            String leerz = ".";
            for (int j = 1; j < leer; j++) {

                leerz = leerz + ".";


            }
            System.out.print("\n" + fahrzeuge[i].fzNr + leerz + "|");


            leer = laenge[1] - fahrzeuge[i].hersteller.length() + 1;
            leerz = ".";
            for (int j = 1; j < leer; j++) {

                leerz = leerz + ".";


            }
            System.out.print(fahrzeuge[i].hersteller + leerz + "|");

            leer = laenge[2] - fahrzeuge[i].typ.length() + 1;
            leerz = ".";
            for (int j = 1; j < leer; j++) {

                leerz = leerz + ".";


            }
            System.out.print(fahrzeuge[i].typ + leerz + "|");

            leer = laenge[3] - fahrzeuge[i].ausfuehrung.length() + 1;
            leerz = ".";
            for (int j = 1; j < leer; j++) {

                leerz = leerz + ".";


            }
            System.out.print(fahrzeuge[i].ausfuehrung + leerz + "|");

            leer = laenge[4] - String.valueOf(fahrzeuge[i].ps).length() + 1;
            leerz = ".";
            for (int j = 1; j < leer; j++) {

                leerz = leerz + ".";


            }
            System.out.print(leerz + fahrzeuge[i].ps + "|");

            leer = laenge[5] - fahrzeuge[i].ez.length() + 1;
            leerz = ".";
            for (int j = 1; j < leer; j++) {

                leerz = leerz + ".";


            }
            System.out.print(fahrzeuge[i].ez + leerz + "|");

            leer = laenge[6] - String.valueOf(fahrzeuge[i].km).length() + 1;
            leerz = ".";
            for (int j = 1; j < leer; j++) {

                leerz = leerz + ".";


            }
            System.out.print(leerz + fahrzeuge[i].km + "|");

            leer = laenge[7] - String.valueOf(fahrzeuge[i].preis).length() + 1;
            leerz = ".";
            for (int j = 1; j < leer; j++) {

                leerz = leerz + ".";


            }
            System.out.print(fahrzeuge[i].preis + leerz + "|");

            //Bestandwert
            bestandwert += fahrzeuge[i].preis;
            System.out.print(bestandwert);



        }

        double mittelwert = 0;
        mittelwert = bestandwert / 18;



        System.out.println("\n\nBestandswert: " + bestandwert + " EUR");
        System.out.println("Mittlerer EKnetto: "+mittelwert);

    }


}

