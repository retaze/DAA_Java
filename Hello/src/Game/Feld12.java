package Game;

import java.util.Scanner;

public class Feld12 {

    public static void start() {

        System.out.println("Die stehst nun auf dem Weg direkt vor der Burg");


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
                    Objekte.umschauen12();
                    break;
                case "guck dich um":
                    Objekte.umschauen12();
                    break;
                case "umschauen":
                    Objekte.umschauen12();
                    break;
                case "gehe nach Norden":
                    Feld11.start();
                    break;
                case "gehe nach Süden":
                    Feld13.start();
                    break;
                case "gehe nach Osten":
                    Objekte.gebirge();
                    break;
                case "gehe nach Westen":
                    Feld9.start();
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
