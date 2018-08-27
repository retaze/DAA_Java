package hello;

public class Pyramide {

    public static void main(String[] args) {

        printpyramide(3);
    }

    public static void printpyramide(int zeilen) {

        int anzahl = -1, z, i;

        for (z = 1; z <= zeilen; z++) {

            for (i = z; i < zeilen; i++) {
                System.out.print(" ");

            }
            anzahl = anzahl + 2;

            for (i = 1; i <= anzahl; i++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}
