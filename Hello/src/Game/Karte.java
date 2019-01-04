package Game;

public class Karte {
    public static void main(String args[]) {


        System.out.println("Test");
        //Hier teste ich wie die Ausgabe einer Kartenfunktion aussehen koennte
        //Ich moechte die die Felder mit Zeichen darstellen
        //Loop in loop geben die felder Zeile fuer Zeile aus

        char[][] kartenArray = new char[][]{
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 }
        };

        for (int iY = 0; iY < 4 ; iY++) {
            for (int i = 0; i < 3; i++) {
                for (int iX = 0; iX < 4; iX++) {
                    System.out.print("  ");
                    System.out.print("W");
                    System.out.print("W");
                    System.out.print("W");
                    System.out.print("WW");

                    System.out.print("  ");
                }
                System.out.println("");
            }
            System.out.println("");
        }

    }
}
