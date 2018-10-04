package KlassenObjekte;

import java.util.regex.Pattern;

public class CIPAdresse implements Cloneable {

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
        String strIPtemp = null;

        if (this.ip != null) {
            strIPtemp = new String("");
            for (int i = 0; i < 4; i++) {
                if (strIPtemp.length() > 0) {
                    strIPtemp += ".";

                }
                strIPtemp += Integer.toString(ip[i]);
            }
        }
        return (strIPtemp);

    }

    private boolean checkIP(int aIP[]) {
        if (aIP.length != 4) return (false);

        for (int i = 0; i < 4; i++) {
            if (aIP[i] < 0 || aIP[i] > 255) return (false);
        }
        return (true);
    }

    public CIPAdresse() {
        this.ip = new int[4];
        this.ip[0] = 1;
        this.ip[1] = 1;
        this.ip[2] = 1;
        this.ip[3] = 1;
    }

    public CIPAdresse(String sIP) {
        if (!setIPStr(sIP)) this.ip = null;
    }

    public CIPAdresse(int aIP[]) {
        if (checkIP(aIP)) this.ip = aIP;

    }

    public String getNetClass() {
        if (ip[0] >= 0 && ip[0] < 128) return ("A");
        if (ip[0] >= 128 && ip[0] < 192) return ("B");
        if (ip[0] >= 192 && ip[0] < 224) return ("C");
        if (ip[0] >= 224 && ip[0] < 240) return ("D");
        if (ip[0] >= 240 && ip[0] < 256) return ("E");
        return ("U");
    }

    @Override
    public CIPAdresse clone() {
        try {
            return (CIPAdresse) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
