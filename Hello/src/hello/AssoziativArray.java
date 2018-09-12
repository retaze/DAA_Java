package hello;

import java.util.HashMap;
import java.util.Map;

public class AssoziativArray {

    public static class RGB_Wert {
        int rot;
        int gruen;
        int blau;
    }

    public static void main(String args[]) {

        RGB_Wert farbe = null;
        Map<String, RGB_Wert> farbwert = new HashMap<String, RGB_Wert>();

        farbe = new RGB_Wert();
        farbe.rot = 138;
        farbe.gruen = 43;
        farbe.blau = 226;
        farbwert.put("Blauviolet", farbe);
        farbe = new RGB_Wert();
        farbe.rot = 0;
        farbe.gruen = 0;
        farbe.blau = 255;
        farbwert.put("Blau", farbe);
        farbe = new RGB_Wert();
        farbe.rot = 127;
        farbe.gruen = 255;
        farbe.blau = 212;
        farbwert.put("Aquamarine", farbe);
        farbe = new RGB_Wert();
        farbe.rot = 0;
        farbe.gruen = 255;
        farbe.blau = 0;
        farbwert.put("Grün", farbe);farbe = new RGB_Wert();
        farbe.rot = 165;
        farbe.gruen = 42;
        farbe.blau = 42;
        farbwert.put("Braun", farbe);farbe = new RGB_Wert();
        farbe.rot = 255;
        farbe.gruen = 0;
        farbe.blau = 0;
        farbwert.put("Rot", farbe);

        System.out.println("Farbe Grün: "+farbwert);

    }
}
