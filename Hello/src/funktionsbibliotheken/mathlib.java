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


}

