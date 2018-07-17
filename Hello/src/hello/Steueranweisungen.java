package hello;

import java.util.Scanner;

public class Steueranweisungen {

    public static void main(String[] args) {

        /* Aufgabe: Absoluter Betrag

        float zahl;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte eine beliebige positive oder negative Zahl eingeben: ");
        zahl = sc.nextFloat();

        if(zahl<0)
        {
            zahl=zahl*-1;
        }

        System.out.println("Absoluter Betrag: "+zahl);


        //Aufgabe: Kleiner Buchstabe
        char zeichen;
        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie einen Buchstaben ein: ");
        zeichen = sc.next(".").charAt(0);

        if (zeichen >= 97 && zeichen <= 122)
        {
            System.out.print(zeichen+" ist ein kleiner Buchstabe");
        }

        //Aufgabe (2.3)
        int z1;
        int z2;
        int abs;
        Scanner sc = new Scanner(System.in);
        System.out.println("Zwei Zahlen eingeben");
        z1 = sc.nextInt();
        z2 = sc.nextInt();
        if (z1-z2>=0)
        {
            abs=z1-z2;
        }
        else
        {
            abs=z2-z1;
        }
        System.out.println(abs);

        //Aufgabe (2.4)
        int z1;
        int z2;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie zwei Zahlen ein:");
        z1 = sc.nextInt();
        z2 = sc.nextInt();
        if (z1>z2)
        {
            max=z1;
        }
        else
        {
            max=z2;
        }
        System.out.println(max+" ist das Maximum");

        //Aufgabe (2.7)
        String text;
        char zeichen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Zeichen, Ziffer oder ein Sonderzeichen ein:");
        zeichen = sc.next(".").charAt(0);

        if (zeichen >= 97 && zeichen <= 122) {
            text = zeichen + " ist eine kleiner Buchstabe.";
        } else {
            if (zeichen >= 65 && zeichen <= 90) {
                text = zeichen + " ist ein großer Buchstabe.";
            } else {
                if (zeichen >= 48 && zeichen <= 58) {
                    text = zeichen + " ist eine Ziffer.";
                } else {
                    text = zeichen + " ist eine sonstiges Zeichen.";
                }
            }
        }
        System.out.println(text);

        //Aufgabe (2.14)
        float wert;
        int versand = 0;
        double rabatt = 1;
        double preis;
        Scanner sc = new Scanner(System.in);

        System.out.println("Warenwert eingeben");
        wert = sc.nextFloat();

        if (wert >= 500) {
            rabatt = 0.95;
        } else {
            if (wert >= 250) {

            } else {
                if (wert >= 100) {
                    versand = 4;
                } else {
                    if (wert >= 20) {
                        versand = 7;
                    } else {
                        versand = 10;
                    }
                }
            }
        }
        preis = (wert * rabatt) + versand;
        System.out.println("Der Endpreis für " + wert + " € Warenwert ist: " + preis + " €.");


        //(3.7) Ganzzahlige Division mit Rest
        int start;
        int end;
        int div;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Start eingeben");
        start = sc.nextInt();
        System.out.println("End eingeben");
        end = sc.nextInt();
        System.out.println("Divisor eingeben");
        div = sc.nextInt();

        for (i = start; i <= end; i++) {
            System.out.println(i + "/" + div + " = " + i / div + " Rest " + i % div);
        }

        //Übung
        int x1, x2, p, i;
        String aus;
        aus = "_";

        for (x1 = 1; x1 <= 13; x1 = x1 + 3) {
            for (x2 = 3; x2 <= 10; x2 = x2 + 3) {
                p = x1 * x2;
                if (p < 10) {
                    aus = aus + "_";
                }
                if (p < 100) {
                    aus = aus + "_";
                }
                System.out.println(aus + p);
                aus = "_";

            }

        }
*/
        //Gehaltsfaktor
        int Alter, Kinder;
        double gFaktor, aFaktor, kFaktor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihr Alter ein: ");
        Alter = sc.nextInt();
        System.out.print("Wie viele Kinder haben Sie?");
        Kinder = sc.nextInt();

        if (Alter < 18) {
            aFaktor = 0.3;
        } else {
            if (Alter <= 25) {
                aFaktor = 0.25;
            } else {
                if (Alter <= 35) {
                    aFaktor = 0.45;
                } else {
                    if (Alter <= 45) {
                        aFaktor = 0.65;
                    } else {
                        if (Alter <= 55) {
                            aFaktor = 0.8;
                        } else {
                            aFaktor = 1.01;
                        }
                    }
                }
            }
        }
        switch (Kinder) {
            case 0:
                kFaktor = 0;
                break;
            case 1:
                kFaktor = 0.03;
                break;
            case 2:
                kFaktor = 0.045;
                break;
            case 3:
                kFaktor = 0.05;
                break;
            default:
                kFaktor = (Kinder - 3) * 0.01 + 0.05;
        }
        gFaktor = aFaktor + kFaktor;
        System.out.print("Mit Ihren " + Alter + " Jahren und " + Kinder + " Kindern haben Sie einen Gehaltsfaktor von " + gFaktor);
            }
}
