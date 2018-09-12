package hello;

public class StrukturenArrays {

    public static void main(String[] args) {

        Artikel art1 = new Artikel();
        Artikel art2 = new Artikel();
        String zk = "";

        art1.nr = 1;
        art1.bez = "PC Speed 2010";
        art1.anzahl = 38;
        art1.preis = 395.f;

        art2.nr = 2;
        art2.bez = "TFT-Display";
        art2.anzahl = 27;
        art2.preis = 179.f;

        zk = art1.bez + ": " + art1.preis + " + " + art1.preis * .19;
        zk = zk + " = " + art1.preis * 1.19;

        System.out.println(zk);

        art2.bez = "TFT-Display 22 HD";
        art2.preis = art2.preis * 0.9f;

        System.out.println(art2.bez);


    }

    public static class Artikel {
        public int nr;
        public String bez;
        public int anzahl;
        public float preis;
    }
}
