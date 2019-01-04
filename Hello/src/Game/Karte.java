package Game;

public class Karte {
    public static void main(String[] args) {
        //Hier teste ich wie die Ausgabe einer Kartenfunktion aussehen koennte
        //Ich moechte die die Felder mit Zeichen darstellen
        //Loop in loop geben die felder Zeile fuer Zeile aus

        //zweidimensionaler Array aus chars der das Feld representiert
        char[][] kartenArray = new char[][]{
                { 'a', 'b', 'c', 'd'},
                { 'e', 'F', 'G', 'H' },
                { 'I', 'j', 'K', 'L' },
                { 'M', 'n', 'O', 'P' }
        };

        //Position an der sich der Spieler befindet
        int xPosition = 0;
        int yPosition = 0;

        //Loop der fuer Jede Zeile einzeln Zeile 0 einmal ....
        for (int iY = 0; iY < 4 ; iY++) {
            //Der Wert wird dreimal ausgeben
            for (int i = 0; i < 3; i++) {
                //Jede Spalte in der Zeile
                for (int iX = 0; iX < 4; iX++) {
                        //Abfagen wenn der Spieler an der Positon ist die gerade geprinted wird dann ein 0
                        if (xPosition == iX && yPosition == iY && i == 1) {
                            System.out.print(kartenArray[iY][iX] + " 0 " + kartenArray[iY][iX]);
                        } else{
                            System.out.print(kartenArray[iY][iX] + " " + kartenArray[iY][iX] + " " + kartenArray[iY][iX]);
                        }
                    System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
