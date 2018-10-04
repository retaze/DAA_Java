package KlassenObjekte;

public class umsatzanalyse {

    public static void main(String args[]) {

        int maxNr = 0;
        int maxUmsatz = 0;

        CPCSystem rec[] = new CPCSystem[5];

        rec[0] = new CPCSystem(1, "Speed 4460 Quad", 264969, 1100);
        rec[1] = new CPCSystem(2, "Speed 4459 Quad", 257785, 890);
        rec[2] = new CPCSystem(3, "Sprint 5419 Quad", 278100, 820);
        rec[3] = new CPCSystem(4, "Sprint 5310 Triple", 179700, 610);
        rec[4] = new CPCSystem(5, "Sprint 5416 Quad", 243125, 580);

        for (int pos = 0; pos < rec.length; pos++) {

            rec[pos].duPreis = Math.round((float) rec[pos].umsatz / (float) rec[pos].anzahl);

            if (rec[pos].umsatz > maxUmsatz) {
                maxNr = pos;
                maxUmsatz = rec[pos].umsatz;
            }

        }

        System.out.println("Ausgabe");
        for (int pos = 0; pos < rec.length; pos++ ) {
            System.out.println(rec[pos].nr + " '" + rec[pos].name + "' " + rec[pos].duPreis + " €");
        }
        System.out.println("\nMaximaler Umsatz: '" + rec[maxNr].name + "' " + rec[maxNr].umsatz + " €");
    }
}
