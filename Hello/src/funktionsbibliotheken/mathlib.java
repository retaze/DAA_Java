package funktionsbibliotheken;

public class mathlib {

    public static int maximum(int z1, int z2) {

        return (z1 < z2 ? z1 : z2);

    }


    public static int minimum(int z1, int z2) {

        return (z1 < z2 ? z1 : z2);

    }

    public static int oktal(int z) {

        int rest = 0, result = 0;
        String okt = "";

        if (z > 0) {
            do {
                rest = z % 8;
                z = (z - rest) / 8;
                okt = String.valueOf(rest) + okt;
            } while (z > 0);

            result = Integer.parseInt(okt);
        }
        return result;
    }

    public static int querSumme(int z) {

        int qs = 0;

        while (z > 0) {
            qs = qs + z % 10;
            z = z / 10;

        }
        return qs;
    }

    public static int ggT(int z1, int z2) {

        while (z1 != z2) {
            if (z1 > z2) {
                z1 = z1 - z2;
            } else {
                z2 = z2 - z1;
            }
        }
        return z1;
    }

    public static int kgV(int z1, int z2) {

        return z1 * z2 / ggT(z1, z2);
    }


}

