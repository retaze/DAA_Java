package Game;

import java.util.Scanner;

public class Feld6 {

    public static void start() {

        System.out.println("Du stehst in einer Höhle");


        String eingabe;
        Scanner sc = new Scanner(System.in);

        int exit = 0;
        while (exit == 0) {
            System.out.println("\bWas möchtest du nun tun?");
            eingabe = sc.nextLine();
            switch (eingabe) {
                case "nehme Schwert":

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
                    Objekte.umschauen6();
                    break;
                case "guck dich um":
                    Objekte.umschauen6();
                    break;
                case "umschauen":
                    Objekte.umschauen6();
                    break;
                case "gehe nach Norden":
                    Objekte.hoehle();
                    break;
                case "gehe nach Süden":
                    Objekte.hoehle();
                    break;
                case "gehe nach Osten":
                    Objekte.hoehle();
                    break;
                case "gehe nach Westen":
                    Feld5.start();
                    break;
                case "Ende":
                    exit = 1;
                    break;
                default:
                    System.out.println("Das habe ich leider nicht verstanden.");
                    break;
            }
        }

    }


}
