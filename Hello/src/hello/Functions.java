package hello;

import java.util.Scanner;

import funktionsbibliotheken.mathlib;

public class Functions {

    public static void main(String[] args) {

        /*int z1, z2, max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte zwei Zahlen eingeben: \n");

        z1 = sc.nextInt();
        z2 = sc.nextInt();

        max = mathlib.maximum(z1, z2);

        System.out.print(max + " ist das Maximum\n");

        max = mathlib.minimum(z1, z2);

        System.out.print(max + " ist das Minimum");

        int a = 105;
        int b = 49;

        System.out.println("Test der mathematischen Funktionen\n");
        System.out.println("Kleinstes gemeinsames Vielfaches von: " + a + " und " + b + " ist: " + mathlib.kgV(a, b));*/
        float anschaffungswert = 0.0f;
        float nutzungsdauer = 0.0f;
        float restwert = 0.0f;
        float abschreibung = 0.0f;

        Scanner sc = new Scanner(System.in);

        System.out.println("Lineare Abschreibung\n");
        System.out.print("Bitte geben sie den Anschaffungswert ein:\n");

        anschaffungswert = sc.nextFloat();

        System.out.println("Bitte geben sie die Nutzungsdauer ein:\n");

        nutzungsdauer = sc.nextFloat();

        abschreibung = anschaffungswert / nutzungsdauer;
        System.out.println("Nutzungsjahr \t Restwert");
        while (anschaffungswert > 0)
        {
            anschaffungswert = anschaffungswert - abschreibung;
            nutzungsdauer--;
            System.out.println(nutzungsdauer + "\t\t\t\t " + anschaffungswert);
        }



    }


}

