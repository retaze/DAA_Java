package KlassenObjekte;

public class TestCArtikel {

    public static void main(String args[]) {


        CArtikel objArt1 = new CArtikel();
        CArtikel objArt2 = new CArtikel();
        CArtikel objArt3;
        CArtikel objArt4;
       /* CArtikel objArt5 = new CArtikel(1, "Server", (float) 4216.25, 9);
        CArtikel objArt6 = new CArtikel(7, "PC DELL 120Pro", 430, 1);*/

        objArt1.setArtikel(1, "Server", (float) 4216.25, 9,1);

        objArt2.setArtikel(7, "PC DELL 120Pro", 430, 8,2);

        objArt3 = objArt1.clone();
        objArt4 = objArt2.clone();

        objArt3.setArtikel(3, "Server XL", 6100, 9,4);
        objArt4.setArtikel(4, "PC DELL 135Extrem", 859, 8,5);

        System.out.println("Artikel 1: ");
        System.out.println("Nr.: " + objArt1.getNr());
        System.out.println("Bezeichnung: " + objArt1.getBezeichnung());
        System.out.println("Preis: " + objArt1.getPreisAsString());
        System.out.println("Anzahl: " + objArt1.getAnzahl());
        System.out.println("Gesamtpreis: " + objArt1.getGesamtpreisAsStr());
        System.out.println();
        System.out.println("Artikel 2: ");
        System.out.println("Nr.: " + String.valueOf(objArt2.getNr()));
        System.out.println("Bezeichnung: " + objArt2.getBezeichnung());
        System.out.println("Preis: " + objArt2.getPreisAsString());
        System.out.println("Anzahl: " + String.valueOf(objArt2.getAnzahl()));
        System.out.println("Gesamtpreis :" + objArt2.getGesamtpreisAsStr());

        System.out.println();
        System.out.println("Artikel 3: ");
        System.out.println("Nr.: " + String.valueOf(objArt3.getNr()));
        System.out.println("Bezeichnung: " + objArt3.getBezeichnung());
        System.out.println("Preis: " + objArt3.getPreisAsString());
        System.out.println("Anzahl: " + String.valueOf(objArt3.getAnzahl()));
        System.out.println("Gesamtpreis :" + objArt3.getGesamtpreisAsStr());
        System.out.println();
        System.out.println("Artikel 4: ");
        System.out.println("Nr.: " + String.valueOf(objArt4.getNr()));
        System.out.println("Bezeichnung: " + objArt4.getBezeichnung());
        System.out.println("Preis: " + objArt4.getPreisAsString());
        System.out.println("Anzahl: " + String.valueOf(objArt4.getAnzahl()));
        System.out.println("Gesamtpreis :" + objArt4.getGesamtpreisAsStr());

        show(objArt1, "Artikel 1: ");
        show(objArt2, "Artikel 2: ");
        show(objArt3, "Artikel 3: ");
        show(objArt4, "Artikel 4: ");
        /*show(objArt5, "___Artikel 1: ");
        show(objArt6, "___Artikel 2: ");*/

    }

    private static void show(CArtikel obj, String titel) {
        System.out.println(titel);
        System.out.println("(");
        System.out.println("[0] => " + obj.getNr());
        System.out.println("[1] => " + obj.getBezeichnung());
        System.out.println("[2] => " + obj.getPreisAsString());
        System.out.println("[3] => " + obj.getAnzahl());
        System.out.println("[4] => "+obj.getWarengruppe());
        System.out.println(")\n");
    }
}
