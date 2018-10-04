/*package KlassenObjekte;

import KlassenObjekte.CIPAdresse;

public class objarray_ipadressen {

    public static void main(String[] args) {
        // IP-Daten in einem Array bereitstellen
        String[] arrIPAdressen = {
                "201.202.203.204",
                "11.10.2.4",
                "150.240.95.85",
                "193.168.187.251",
                "100.33.44.99",
                "191.72.27.4",
                "130.200.100.1",
                "205.105.105.205",
                "50.58.200.235",
                "210.0.0.1"
        };
        int[] IP = null;    // Hilfsvariable zur Darstellung einer IP-Adresse
        int Anzahl_A = 0;
        int Anzahl_B = 0;
        int Anzahl_C = 0;
        int pos;

        // Erzeugung eines Arrays vom Type CIPAdresse mit der selben
        // Anzahl an Elemeten wie die Musterdaten.
        CIPAdresse[] oArrIP = new CIPAdresse[arrIPAdressen.length];

        // Initialisierung des Arrays oArrIP mit den Musterdaten
        for (pos = 0; pos < oArrIP.length; pos++) {
            oArrIP[pos] = new CIPAdresse(arrIPAdressen[pos]);
        }
        // Auswertung der IP-Adressen
        for (pos = 0; pos < oArrIP.length; pos++) {
            IP = oArrIP[pos].getIP();   // aktuelle IP auslesen
            if (IP[0].getClass() == "A") Anzahl_A++;
            if (IP[0].getClass() == "B") Anzahl_B++;
            if (IP[0].getClass() == "C") Anzahl_C++;
        }
        // Ausgabe der Auswertung
        System.out.println("Anzahl IP-Adressen: " + oArrIP.length);
        System.out.println("Davon Klaase 'A': " + Anzahl_A);
        System.out.println("Davon Klaase 'B': " + Anzahl_B);
        System.out.println("Davon Klaase 'C': " + Anzahl_C);
    }
}*/

