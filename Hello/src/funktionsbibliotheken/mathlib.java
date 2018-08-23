package funktionsbibliotheken;

public class mathlib {

    public static int maximum(int z1, int z2) {

        int max = 0;

        if (z1 > z2) {
            max = z1;
        } else {
            max = z2;
        }
        return max;

    }


    public static int minimum(int z1, int z2) {

        int max = 0;

        if (z1 < z2) {
            max = z1;
        } else {
            max = z2;
        }
        return max;

    }
}
