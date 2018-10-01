package hello;

public class Laufzeit {

    public static double getLaufzeit(long start, long stop) {

        long swap;

        if (start > stop) {
            swap = start;
            start = stop;
            stop = swap;
        }
        return ((stop - start) / 1000.0);
    }

    public static void main(String args[]) {

        long start, stop;
        double zahl;

        start = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {

            zahl = (double) i;
            Math.sqrt(zahl);
        }
        stop = System.currentTimeMillis();

        System.out.println("Die Schleife ist " + getLaufzeit(start, stop) + " Sekunden gelaufen");
    }
}

