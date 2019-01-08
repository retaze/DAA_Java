package Game;

import java.util.Scanner;

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
        Boolean[][] kartenArrayAufgedeckt = new Boolean[][] {
                {true,  false, false, false},
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };
        //Position an der sich der Spieler befindet
        int xPosition = 0;
        int yPosition = 0;
        Scanner reader = new Scanner(System.in);
        //Main Game Loop
        while(true) {
            String command = reader.nextLine();
            if(command.equals("exit")){
                break;
            }else if (command.equals("norden") && yPosition > 0){
                yPosition -= 1;
                kartenArrayAufgedeckt[yPosition][xPosition] = true;
            }else if(command.equals("osten") && xPosition < 3 ){
                xPosition += 1;
                kartenArrayAufgedeckt[yPosition][xPosition] = true;
            }else if(command.equals("sueden") && yPosition < 3 ){
                yPosition += 1;
                kartenArrayAufgedeckt[yPosition][xPosition] = true;
            }else if(command.equals("westen") && xPosition > 0 ){
                xPosition -= 1;
                kartenArrayAufgedeckt[yPosition][xPosition] = true;
            }else {
                System.out.println("Verstehe ich nicht!");
            }
            printMap(kartenArray, kartenArrayAufgedeckt, xPosition, yPosition);
        }
        System.out.println("Thanks for playing");
    }

    private static void printMap(char[][] kartenArray, Boolean[][] kartenArrayAufgedeckt, int xPosition, int yPosition) {
        //Loop der fuer Jede Zeile einzeln Zeile 0 einmal ....
        for (int iY = 0; iY < 4 ; iY++) {
            //Der Wert wird dreimal ausgeben
            for (int i = 0; i < 3; i++) {
                //Jede Spalte in der Zeile
                for (int iX = 0; iX < 4; iX++) {
                    //Abfagen wenn der Spieler an der Positon ist die gerade geprinted wird dann ein 0
                    if (kartenArrayAufgedeckt[iY][iX]) {
                        if (xPosition == iX && yPosition == iY && i == 1) {
                            System.out.print(kartenArray[iY][iX] + " 0 " + kartenArray[iY][iX]);
                        } else{
                            System.out.print(kartenArray[iY][iX] + " " + kartenArray[iY][iX] + " " + kartenArray[iY][iX]);
                        }
                    } else {
                        System.out.print("     ");
                    }
                    System.out.print("  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
