package Game;

import java.util.Scanner;

public class Feld4 {

    public static void start() {

        System.out.println("Du stehst auf der Hochebene auf einer Wiese. Der frische Grasgeruch weht dir in die Nase.");


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
                    Objekte.umschauen4();
                    break;
                case "guck dich um":
                    Objekte.umschauen4();
                    break;
                case "umschauen":
                    Objekte.umschauen4();
                    break;
                case "gehe nach Norden":
                    Feld5.start();
                    break;
                case "gehe nach Süden":
                    Feld3.start();
                    break;
                case "gehe nach Osten":
                    Feld7.start();
                    break;
                case "gehe nach Westen":
                    Objekte.gebirge();
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
