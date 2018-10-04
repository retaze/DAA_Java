package KlassenObjekte;

public class TestCArtikel {

    public static void main(String args[]) {

        double preis = 4216.25;

        CArtikel objArt1 = new CArtikel();
        CArtikel objArt2 = new CArtikel();

        objArt1.setArtikel(1,"Server", (float)preis,9);

        objArt2.setArtikel(2,"PC DELL 120Pro",430,1);

        System.out.println("Artikel 1: ");
        System.out.println("Nr.: "+objArt1.getNr());
        System.out.println("Bezeichnung: "+objArt1.getBezeichnung());
        System.out.println("Preis: "+objArt1.getPreisAsString());
        System.out.println("Anzahl: "+objArt1.getAnzahl());
        System.out.println("Gesamtpreis: "+objArt1.getGesamtpreisAsStr());
        System.out.println();
        System.out.println("Artikel 2: ");
        System.out.println("Nr.: "+String.valueOf(objArt2.getNr()));
        System.out.println("Bezeichnung: "+objArt2.getBezeichnung());
        System.out.println("Preis: "+objArt2.getPreisAsString());
        System.out.println("Anzahl: "+String.valueOf(objArt2.getAnzahl()));
        System.out.println("Gesamtpreis :"+objArt2.getGesamtpreisAsStr());

    }
}
