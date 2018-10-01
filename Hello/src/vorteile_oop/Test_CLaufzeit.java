package vorteile_oop;

import hello.CLaufzeit;

public class Test_CLaufzeit {

    public static void main(String args[]) {

        CLaufzeit objLaufzeit = new CLaufzeit();
        int a, b, diag;
        double fd;
        int zaehler = 0;

        objLaufzeit.setStart();

        for (a = 1; a < 100; a++) {
            for (b = 1; b <= a; b++) {
                fd = Math.sqrt((double) (a * a) + (double) (b * b));
                diag = (int) fd;

                if (diag == fd) {
                    System.out.println("Seiten: " + a + "/" + b + " - " + fd);
                    zaehler++;
                }
            }
        }
        System.out.println("Es wurden "+zaehler+" Rechtecke gefunden!");
        objLaufzeit.setStop();
        System.out.println("Die Schleife ist "+objLaufzeit.getLaufzeit()+" Sekunden gelaufen");
    }
}
