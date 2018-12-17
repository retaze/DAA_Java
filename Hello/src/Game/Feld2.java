package Game;

import java.util.Scanner;

public class Feld2 {

    public static void start() {

        System.out.println("Du befindest dich auf der alten Handelsstraße.");


        String eingabe;
        Scanner sc = new Scanner(System.in);

        int exit = 0;
        while (exit == 0) {
            System.out.println("\bWas möchtest du nun tun?");
            eingabe = sc.nextLine();
            switch (eingabe) {
                case "nehme Schwert":
                    System.out.println("Du kriechst unter den Karren und hebst ein altes Kurzschwert auf. Toll, jetzt hast du eine Waffe, die du gegen Zaratul einsetzten kannst.");
                    Main.schwert = 1;
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
                    Objekte.umschauen2();
                    break;
                case "guck dich um":
                    Objekte.umschauen2();
                    break;
                case "umschauen":
                    Objekte.umschauen2();
                    break;
                case "gehe nach Norden":
                    Feld3.start();
                    break;
                case "gehe nach Süden":
                    Feld1.start();
                    break;
                case "gehe nach Osten":
                    Objekte.goldsee();
                    break;
                case "gehe nach Westen":
                    Objekte.gebirge();
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
