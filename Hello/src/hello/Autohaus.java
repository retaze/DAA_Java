package hello;

import java.util.Scanner;

public class Autohaus {

    public static void main(String[] args) {

        int platz;
        String rueckgabe;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte Platznummer eingeben: ");
        platz = sc.nextInt();

        rueckgabe = Lager(platz);
        System.out.println("Ihr Auto befindet sich in Reihe/Spalte: "+rueckgabe);
    }

    public static String Lager(int platz) {

        int reihe = platz / 7;
        if (platz % 7 != 0) {
            reihe++;
        }
        int spalte = platz - ((reihe - 1) * 7);
        String rueckgabe = reihe + "/" + spalte;
        return rueckgabe;
    }

}
