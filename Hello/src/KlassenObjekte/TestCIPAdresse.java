package KlassenObjekte;

public class TestCIPAdresse {

    public static void main(String args[]) {

        CIPAdresse objIP = new CIPAdresse();
        CIPAdresse objSubnetMask = new CIPAdresse();
        int ip1[] = null;

        int ip[] = {192, 168, 1, 1};
        objIP.setIP(ip);
        objSubnetMask.setIPStr("255.255.255.240");

        ip1 = objIP.getIp();
        System.out.println("IP-Adressen: " + ip1[0] + "." + ip1[1] + "." + ip1[2] + "." + ip1[3]);
        System.out.println("Subnetmaske: " + objSubnetMask.getIPStr());

        //CLONEN
        CIPAdresse objIP2 = new CIPAdresse();
        CIPAdresse objIP3;
        int ip2[] = {192, 168, 1, 1};
        int ip3[] = {192, 168, 200, 200};
        objIP2.setIP(ip2);

        System.out.println(" ");
        System.out.print("Wert von objIP2 vor der Zuweisung: ");
        System.out.println(objIP2.getIPStr());
        objIP3 = objIP2.clone();

        System.out.print("Wert von objIP3 vor der Zuweisung: ");
        System.out.println(objIP3.getIPStr());

        objIP3.setIP(ip3);
        System.out.print("Neuer Wert von objIP3: ");
        System.out.println(objIP3.getIPStr());
        System.out.print("Wert von objIP2: ");
        System.out.println(objIP2.getIPStr());

        int IP[] = null;
        int Anzahl_A = 0;
        int Anzahl_B = 0;
        int Anzahl_C = 0;
        int pos;



    }
}
