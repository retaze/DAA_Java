package Game;

import java.util.Scanner;

public class Feld7 {

    public static void start() {

        System.out.println("Eine weite Ebene erstreckt sich vor dir.");
        if (Objekte.ebenenMonster == 1) {
            System.out.println("Ein grimmiges Ebenen-Monster kommt auf dich zugerannt und greift dich an.");
        }


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
                    Objekte.umschauen7();
                    break;
                case "guck dich um":
                    Objekte.umschauen7();
                    break;
                case "umschauen":
                    Objekte.umschauen7();
                    break;
                case "gehe nach Norden":
                    Objekte.gebirge();
                    break;
                case "gehe nach Süden":
                    Objekte.ebeneEnde();
                    break;
                case "gehe nach Osten":
                    Feld10.start();
                    break;
                case "gehe nach Westen":
                    Feld4.start();
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
