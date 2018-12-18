package Game;

import java.util.Scanner;

public class Feld1 {

    public static void start() {

        String eingabe;

        Scanner sc = new Scanner(System.in);

        System.out.println("Du stehst auf der alten Handelsstraße.");

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
                    Objekte.umschauen1();
                    break;
                case "guck dich um":
                    Objekte.umschauen1();
                    break;
                case "umschauen":
                    Objekte.umschauen1();
                    break;
                case "gehe nach Norden":
                    Feld2.start();
                    break;
                case "gehe nach Süden":
                    Objekte.gebirge();
                    break;
                case "gehe nach Osten":
                    Objekte.goldsee();
                    break;
                case "gehe nach Westen":
                    Objekte.gebirge();
                    break;
                case "gehe zum ende":
                    Feld14.start();
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
