package Game;


import java.util.Scanner;

public class Main {

    public static String name;
    public static int schwert = 0;
    public static int exit = 0;


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("\b");
        System.out.println("Willkommen Wanderer!");
        System.out.println("Du stehst am Anfang eines großen Abenteuers.");
        System.out.println("\b");
        System.out.println("Von Norden nähert sich ein Reiter. Er kommt im Galopp angeritten, zügelt kurz vor dir sein Pferd und scheint mit dir sprechen zu wollen:");
        System.out.println("\b");
        System.out.println("\b");
        System.out.println("\"Wie ist dein Name?\"");
        name = sc.nextLine();
        System.out.println("\"" + name + " heißt du? Dann ist dies hier für dich!\"");
        System.out.println("Der Reiter wirft dir einen Brief zu, wendet sein Pferd und verschwindet wieder.");
        System.out.println("\b");


        Feld1.start();

        hallo welt

    }
}
