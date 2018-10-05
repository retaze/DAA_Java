package KlassenObjekte;

import java.util.Arrays;

public class TestCAbschreibung {

    public static void main(String args[]) {

        CAbschreibung testAbschr = new CAbschreibung();

        testAbschr.setAnfang(10500, 7);


        System.out.println(Arrays.toString(testAbschr.getErsteAbschreibung()));
        System.out.println(Arrays.toString(testAbschr.getFolgeAbschreibung()));
        System.out.println(Arrays.toString(testAbschr.getFolgeAbschreibung()));
        System.out.println(Arrays.toString(testAbschr.getFolgeAbschreibung()));
        System.out.println(Arrays.toString(testAbschr.getFolgeAbschreibung()));
        System.out.println(Arrays.toString(testAbschr.getFolgeAbschreibung()));
        System.out.println(Arrays.toString(testAbschr.getFolgeAbschreibung()));



        // + " Jahresanfang: " + testAbschr.getFolgeAbschreibung()[1] + " Abschreibung: " + testAbschr.getFolgeAbschreibung()[2] + " Jahresende: " + testAbschr.getFolgeAbschreibung()[3] + " Jahresanfang: " + testAbschr.getFolgeAbschreibung()[4] + " Jahresende: " + testAbschr.getFolgeAbschreibung()[5]);

    }
}
