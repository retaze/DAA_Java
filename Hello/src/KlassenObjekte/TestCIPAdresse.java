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
        System.out.println("IP-Adressen: "+ip1[0]+"."+ip1[1]+"."+ip1[2]+"."+ip1[3]);
        System.out.println("Subnetmaske: "+objSubnetMask.getIPStr());
    }
}
