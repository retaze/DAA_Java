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

        System.out.print(max + " ist das Minimum");*/

        int a = 105;
        int b = 49;

        System.out.println("Test der mathematischen Funktionen\n");
        System.out.println("Kleinstes gemeinsames Vielfaches von: " + a + " und " + b + " ist: " + mathlib.kgV(a, b));


    }


}

