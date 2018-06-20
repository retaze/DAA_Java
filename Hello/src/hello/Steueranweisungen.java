package hello;

import java.util.Scanner;

public class Steueranweisungen {

    public static void main(String[] args) {

        /* Aufgabe: Absoluter Betrag

        float zahl;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte eine beliebige positive oder negative Zahl eingeben: ");
        zahl = sc.nextFloat();

        if(zahl<0)
        {
            zahl=zahl*-1;
        }

        System.out.println("Absoluter Betrag: "+zahl);


        //Aufgabe: Kleiner Buchstabe
        char zeichen;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie einen Buchstaben ein: ");
        zeichen = sc.next(".").charAt(0);

        if (zeichen >= 97 && zeichen <= 122)
        {
            System.out.print(zeichen+" ist ein kleiner Buchstabe");
        }

        //Aufgabe (2.3)
        int z1;
        int z2;
        int abs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zwei Zahlen eingeben");
        z1 = sc.nextInt();
        z2 = sc.nextInt();
        if (z1-z2>=0)
        {
            abs=z1-z2;
        }
        else
        {
            abs=z2-z1;
        }
        System.out.println(abs);
        */

        //Aufgabe (2.4)
        int z1;
        int z2;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie zwei Zahlen ein:");
        z1 = sc.nextInt();
        z2 = sc.nextInt();
        if (z1>z2)
        {
            max=z1;
        }
        else
        {
            max=z2;
        }
        System.out.println(max+" ist das Maximum");
    }
}
