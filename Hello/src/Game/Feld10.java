package Game;

import java.util.Scanner;

public class Feld10 {

    public static void start() {

        System.out.println("Du befindest dich auf der Hoch-Ebene.");


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
                    Objekte.umschauen10();
                    break;
                case "guck dich um":
                    Objekte.umschauen10();
                    break;
                case "umschauen":
                    Objekte.umschauen10();
                    break;
                case "gehe nach Norden":
                    Objekte.gebirge();
                    break;
                case "gehe nach Süden":
                    Objekte.waldEnde();
                    break;
                case "gehe nach Osten":
                    Feld11.start();
                    break;
                case "gehe nach Westen":
                    Feld7.start();
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
