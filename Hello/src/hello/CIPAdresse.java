package hello;

import java.util.regex.Pattern;

public class CIPAdresse {

    private int ip[] = null;

    public boolean setIP(int aIP[]) {

        boolean ipOK = false;
        this.ip = null;

        if (checkIP(aIP)) {
            ipOK = true;
            this.ip = aIP;
        }
        return (ipOK);
    }

    public boolean setIPStr(String strIP) {

        boolean ipOK = false;
        String tempStr[] = null;
        int arrIP[] = {-1, -1, -1, -1};
        this.ip = null;
        tempStr = strIP.split(Pattern.quote("."));

        if (tempStr.length < 4) return (false);

        for (int i = 0; i < tempStr.length; i++) {
            try {
                arrIP[i] = Integer.parseInt(tempStr[i]);

            } catch (Exception ex) {
                return (false);
            }
        }
        if (checkIP(arrIP)) {
            ipOK = true;
            this.ip = arrIP;
        }
        return (ipOK);
    }

    public int[] getIp() {
        return (this.ip);
    }

    public String getIPStr() {

    }

}
