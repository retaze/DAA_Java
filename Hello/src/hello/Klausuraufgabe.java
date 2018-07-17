package hello;

public class Klausuraufgabe {

    public static void main(String[] args) {

        int z, z1, i;
        String b;
        b = "";
        z1 = 103;
        z = z1;
        int start = 1;
        int end = 4;

        while (z > 0) {
            for (i = start; i <= end; i++) {
                b = (z % 2) + b;
                z = (z / 2);
            }
            if (z > 0) {
                b = " " + b;
            }

        }
        System.out.println(z1+b);
    }
}
