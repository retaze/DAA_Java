package hello;

public class ArraysUebung3 {

    public static void main(String args[]) {

        Daten aDat[] = new Daten[5];

        aDat[0] = new Daten();
        aDat[1] = new Daten();
        aDat[2] = new Daten();
        aDat[3] = new Daten();
        aDat[4] = new Daten();

        aDat[0].name = "Speed 4460";
        aDat[0].umsatz = 264969;
        aDat[1].name = "Speed 4459";
        aDat[1].umsatz = 257785;
        aDat[2].name = "Sprint 5419";
        aDat[2].umsatz = 278100;
        aDat[3].name = "Sprint 5310";
        aDat[3].umsatz = 179700;
        aDat[4].name = "Sprint 5416";
        aDat[4].umsatz = 243125;

        int pos = 0;
        for (int i = 1; i < 5; i++) {
            if (aDat[pos].umsatz < aDat[i].umsatz) {
                pos = i;
            }

        }
        System.out.println("Umsatzanalyse:\n");
        System.out.println("Größter Umsatz: "+pos+" - "+aDat[pos].name+": "+aDat[pos].umsatz);

    }

    public static class Daten {

        String name;
        float umsatz;
    }

}
