package Game;

import java.util.Scanner;

public class Feld3 {

    public static void start() {

        System.out.println("Die alte Handelsstraße teilt sich in zwei Wege auf");


        String eingabe;
        Scanner sc = new Scanner(System.in);

        while (Main.exit == 0) {
            System.out.println("\bWas möchtest du nun tun?");
            eingabe = sc.nextLine();
            switch (eingabe) {

                case "öffne Brief":
                    Objekte.brief();
                    break;
                case "oeffne Brief":
                    Objekte.brief();
                    break;
                case "lese Brief":
                    Objekte.brief();
                    break;
                case "schau dich um":
                    Objekte.umschauen3();
                    break;
                case "guck dich um":
                    Objekte.umschauen3();
                    break;
                case "umschauen":
                    Objekte.umschauen3();
                    break;
                case "gehe nach Norden":
                    Feld4.start();
                    break;
                case "gehe nach Sueden":
                    Feld2.start();
                    break;
                case "gehe nach Osten":
                    Feld8.start();
                    break;
                case "gehe nach Westen":
                    Objekte.gebirge();
                    break;
                case "Ende":
                    Main.exit = 1;
                    break;
                default:
                    System.out.println("Das habe ich leider nicht verstanden.");
                    break;
            }
        }

    }


}
