package hello;

public class AssoziativArray2 {

    public static void main(String args[]) {


        Person ap[] = new Person[4];
        String zk = "";

        String name;
        int minNr;
        String name1;
        int maxNr;

        ap[0] = new Person();
        ap[1] = new Person();
        ap[2] = new Person();
        ap[3] = new Person();

        ap[0].nr = 1;
        ap[0].name = "Lange";
        ap[0].ort = "Hof";
        ap[0].telNr = "01493456765";
        ap[1].nr = 2;
        ap[1].name = "Kunz";
        ap[1].ort = "Darß";
        ap[1].telNr = "03823545";
        ap[2].nr = 3;
        ap[2].name = "Bader";
        ap[2].ort = "Roth";
        ap[2].telNr = "09171449";
        ap[3].nr = 4;
        ap[3].name = "Stark";
        ap[3].ort = "Fulda";
        ap[3].telNr = "0661764568";

        name = ap[0].name;
        name1 = ap[0].name;
        minNr = ap[0].nr;
        maxNr = ap[0].nr;

        for (int i = 0; i < 3; i++) {
            zk = ap[i].nr + ": " + ap[i].name + " - " + ap[i].ort + ", " + ap[i].telNr;
            System.out.println(zk);

            if ((ap[i].name).compareTo(name1) > 0) {
                name1 = ap[i].name;
                maxNr = ap[i].nr;

            }
            if (ap[i].name.compareTo(name) < 0) {
                name = ap[i].name;
                minNr = ap[i].nr;
            }


        }
        System.out.println("Kleinster Name: " + minNr + "; " + name);
        System.out.println("Größter Name: " + maxNr + "; "+name1);

    }

    public static class Person {
        int nr;
        String name;
        String ort;
        String telNr;

    }


}
