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
        System.out.println(rueckgabe);
    }

    public static String Lager(int platz) {

        int reihe, spalte;
        String rueckgabe;

        reihe = (int) platz / 7;
        if (platz % 7 != 0)
        {
            reihe++;
        }
        spalte = platz - ((reihe - 1) * 7);
        rueckgabe = reihe + "/" + spalte;
        return rueckgabe;
    }

}
