package KlassenObjekte;

public class TestCAbschreibung {

    public static void main(String args[]) {

        CAbschreibung testAbschr = new CAbschreibung();

        testAbschr.setAnfang(1000, 5);


        System.out.println("Jahr: " + testAbschr.getErsteAbschreibung()[0] + " Jahresanfang: " + testAbschr.getErsteAbschreibung()[1] + " Abschreibung: " + testAbschr.getErsteAbschreibung()[2] + " Jahresende: " + testAbschr.getErsteAbschreibung()[3] + " Jahresanfang: " + testAbschr.getErsteAbschreibung()[4] + " Jahresende: " + testAbschr.getErsteAbschreibung()[5]);
        System.out.println("Jahr: " + testAbschr.getFolgeAbschreibung()[0] + " Jahresanfang: " + testAbschr.getFolgeAbschreibung()[1] + " Abschreibung: " + testAbschr.getFolgeAbschreibung()[2] + " Jahresende: " + testAbschr.getFolgeAbschreibung()[3] + " Jahresanfang: " + testAbschr.getFolgeAbschreibung()[4] + " Jahresende: " + testAbschr.getFolgeAbschreibung()[5]);

    }
}
