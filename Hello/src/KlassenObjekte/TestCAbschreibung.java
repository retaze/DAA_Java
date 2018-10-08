package KlassenObjekte;

import java.util.Arrays;

public class TestCAbschreibung {

    public static void main(String args[]) {

        CAbschreibung testAbschr = new CAbschreibung();

        testAbschr.setAnfang(10500, 7);


        System.out.println(Arrays.toString(testAbschr.getErsteAbschreibung()));
        for (int i=1; i <= testAbschr.getNutzungsDauer()-1; i++ ) {
            System.out.println(Arrays.toString(testAbschr.getFolgeAbschreibung()));
        }

    }
}
