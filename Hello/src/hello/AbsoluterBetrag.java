package hello;

import java.util.Scanner;

public class AbsoluterBetrag {

    public static void main(String[] args) {

        //Variblendeklaration
        float zahl;
        Scanner sc = new Scanner(System.in);

        //Eingabe
        System.out.println("Bitte eine beliebige positive oder negative Zahl eingeben: ");
        zahl = sc.nextFloat();

        //Schleife
        if(zahl<0)
        {
            zahl=zahl*-1;
        }

        //Ausgabe
        System.out.println("Absoluter Betrag: "+zahl);
    }
}
