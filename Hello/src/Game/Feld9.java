package Game;

import java.util.Scanner;

public class Feld9 {

    public static int waldMonster = 10;


    public static void start() {

        String eingabe;
        Scanner sc = new Scanner(System.in);

        System.out.println("Du stehst tief im dunklen Wald.");
        if (Feld9.waldMonster > 0) {
            System.out.println("Ein böses Wald-Monster kommt auf dich zugerannt und greift dich an.");
            System.out.println("\bWas möchtest du nun tun?");
            eingabe = sc.nextLine();
            switch (eingabe) {

                case "töte Wald-Monster":
                    Feld9.waldMonster = 0;
                    System.out.println("Du  bist sehr stark und tötest das Monster mit einem Schwertstreich.");
                    break;

                default:
                    System.out.println("Das habe ich leider nicht verstanden.");
                    break;
            }
        }



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
                    Objekte.umschauen9();
                    break;
                case "guck dich um":
                    Objekte.umschauen9();
                    break;
                case "umschauen":
                    Objekte.umschauen9();
                    break;
                case "gehe nach Norden":
                    Objekte.waldEnde();
                    break;
                case "gehe nach Süden":
                    Objekte.goldsee();
                    break;
                case "gehe nach Osten":
                    Feld12.start();
                    break;
                case "gehe nach Westen":
                    Feld8.start();
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
