package Game;

import java.util.Scanner;

public class Feld14 {

    public static void start() {

        System.out.println("Du befindest dich nun im Kerker.");


        String eingabe;
        Scanner sc = new Scanner(System.in);

        int exit = 0;
        while (exit == 0) {
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
                    Objekte.umschauen14();
                    break;
                case "guck dich um":
                    Objekte.umschauen14();
                    break;
                case "umschauen":
                    Objekte.umschauen14();
                    break;
                case "gehe nach Norden":
                    Feld13.start();
                    break;
                case "gehe nach Süden":
                    Objekte.burgEnde();
                    break;
                case "gehe nach Osten":
                    Objekte.burgEnde();
                    break;
                case "gehe nach Westen":
                    Objekte.burgEnde();
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
