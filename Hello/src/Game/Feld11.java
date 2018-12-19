package Game;

import java.util.Scanner;

public class Feld11 {

    public static void start() {

        System.out.println("Der Pfad verbindet die Hochebene mit dem Tal davor.");


        String eingabe;
        Scanner sc = new Scanner(System.in);

        while (Main.exit == 0) {
            System.out.println("\b");
            System.out.println("Was möchtest du nun tun?");
            System.out.println("\b");
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
                    Objekte.umschauen11();
                    break;
                case "guck dich um":
                    Objekte.umschauen11();
                    break;
                case "umschauen":
                    Objekte.umschauen11();
                    break;
                case "gehe nach Norden":
                    Objekte.gebirge();
                    break;
                case "gehe nach Süden":
                    Feld12.start();
                    break;
                case "gehe nach Osten":
                    Objekte.gebirge();
                    break;
                case "gehe nach Westen":
                    Feld10.start();
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
