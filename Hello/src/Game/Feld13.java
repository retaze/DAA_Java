package Game;

import java.util.Scanner;

public class Feld13 {

    public static int zaratul = 10;

    public static void start() {

        String eingabe;
        Scanner sc = new Scanner(System.in);

        System.out.println("Du betrittst die Burg Zaratul.");
        if (Feld13.zaratul > 0) {
            System.out.println("Zaratul kommt auf dich zugerannt und greift dich an.");
            System.out.println("\bWas möchtest du nun tun?");
            eingabe = sc.nextLine();
            switch (eingabe) {

                case "toete Zaratul":
                    Feld13.zaratul = 0;
                    System.out.println("Du tötest Zaratul.");
                    break;

                default:
                    System.out.println("Das habe ich leider nicht verstanden.");
                    break;
            }
        }


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
                    Objekte.umschauen13();
                    break;
                case "guck dich um":
                    Objekte.umschauen13();
                    break;
                case "umschauen":
                    Objekte.umschauen13();
                    break;
                case "gehe nach Norden":
                    Feld12.start();
                    break;
                case "gehe nach Sueden":
                    Feld14.start();
                    break;
                case "gehe nach Osten":
                    Objekte.burgEnde();
                    break;
                case "gehe nach Westen":
                    Objekte.burgEnde();
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
