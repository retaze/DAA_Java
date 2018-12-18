package Game;

import java.util.Scanner;

public class Feld6 {

    public static int truhe = 1;

    public static void start() {

        System.out.println("Du stehst in einer Höhle");


        String eingabe;
        Scanner sc = new Scanner(System.in);

        while (Main.exit == 0) {
            System.out.println("\bWas möchtest du nun tun?");
            eingabe = sc.nextLine();
            switch (eingabe) {
                case "öffne Truhe":
                    if (Feld6.truhe == 1) {
                        System.out.println("Die Truhe ist leer. Schade, da war wohl schon jemand vor dir da.");
                        Feld6.truhe = 0;
                    }
                    break;
                case "oeffne Truhe":
                    if (Feld6.truhe == 1) {
                        System.out.println("Die Truhe ist leer. Schade, da war wohl schon jemand vor dir da.");
                        Feld6.truhe = 0;
                    }
                    break;
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
                    Main.exit = 1;
                    break;
                default:
                    System.out.println("Das habe ich leider nicht verstanden.");
                    break;
            }
        }

    }


}
