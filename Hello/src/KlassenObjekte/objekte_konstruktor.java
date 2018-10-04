package KlassenObjekte;

public class objekte_konstruktor {

    public static void main(String args[]) {

        CIPAdresse objIP1 = new CIPAdresse("192.168.1.1");
        CIPAdresse objIP2 = new CIPAdresse();

        System.out.println("Wert von objIP1: "+objIP1.getIPStr());
        System.out.println("Wert von objIP2: "+objIP2.getIPStr());
    }
}
