package KlassenObjekte;

import java.text.DecimalFormat;

public class CArtikel implements Cloneable {

    private CRecArtikel oArtikel = null;

    CArtikel() {
        oArtikel = new CRecArtikel();
    }

    @Override
    public CArtikel clone() {
        try {
            return (CArtikel) super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public CArtikel(int nr, String bezeichnung, float preis, int anzahl,int wg) {
        if (nr > 0) oArtikel.nr = nr;
        oArtikel.bezeichnung = bezeichnung;
        if (preis > 0) oArtikel.preis = preis;
        if (anzahl > 0) oArtikel.anzahl = anzahl;
        if (wg > 0) oArtikel.warengruppe = wg;

    }

    public void setArtikel(int nr, String bezeichnung, float preis, int anzahl, int wg) {
        if (nr > 0) oArtikel.nr = nr;
        oArtikel.bezeichnung = bezeichnung;
        if (preis > 0) oArtikel.preis = preis;
        if (anzahl > 0) oArtikel.anzahl = anzahl;
        if (wg > 0) oArtikel.warengruppe = wg;
    }

    public void setNr(int nr) {
        if (nr < 0) {
            oArtikel.nr = 0;
        } else {
            oArtikel.nr = nr;
        }
    }

    public int getNr() {
        return (oArtikel.nr);
    }

    public void setBezeichnung(String bezeichnung) {
        if (bezeichnung != null) oArtikel.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return (oArtikel.bezeichnung);
    }

    public void setPreis(int preis) {
        if (preis < 0) {
            oArtikel.preis = 0;
        } else {
            oArtikel.preis = preis;
        }
    }

    public float getPreis() {
        return (oArtikel.preis);
    }

    public String getPreisAsString() {
        String tmpPreis = "";
        tmpPreis = floatAsStr(oArtikel.preis);
        return (tmpPreis);
    }

    public void setAnzahl(int anzahl) {
        if (anzahl < 0) {
            oArtikel.anzahl = 0;
        } else {
            oArtikel.anzahl = anzahl;
        }
    }

    public int getAnzahl() {
        return (oArtikel.anzahl);
    }

    public float getGesamtpreis() {
        return (oArtikel.preis * oArtikel.anzahl);
    }

    public String getGesamtpreisAsStr() {
        String tmpPreis = "";
        tmpPreis = floatAsStr(oArtikel.preis * oArtikel.anzahl);
        return (tmpPreis);
    }

    private String floatAsStr(float value) {
        String tmpPreis = "";
        DecimalFormat df = new DecimalFormat("#,##0.00");
        tmpPreis = df.format(value);
        return (tmpPreis);
    }

    public void setWarenGruppe(int wg) {
        if (wg < 0) {
            oArtikel.warengruppe = 0;

        } else {
            oArtikel.warengruppe = wg;
        }
    }

    public int getWarengruppe() {
        return (oArtikel.warengruppe);
    }


}
