package Game;

import java.util.Scanner;

public class Feld8 {

    public static void start() {

        System.out.println("Du stehst tief im dunklen Wald.");


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
                    Objekte.umschauen8();
                    break;
                case "guck dich um":
                    Objekte.umschauen8();
                    break;
                case "umschauen":
                    Objekte.umschauen8();
                    break;
                case "gehe nach Norden":
                    Objekte.waldEnde();
                    break;
                case "gehe nach Süden":
                    Objekte.goldsee();
                    break;
                case "gehe nach Osten":
                    Feld9.start();
                    break;
                case "gehe nach Westen":
                    Feld3.start();
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
