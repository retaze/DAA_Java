package KlassenObjekte;

import java.text.DecimalFormat;

public class CArtikel {

    private int aNr = 0;
    private String aBezeichnung = "";
    private float aPreis = 0;
    private int aAnzahl = 0;

    CArtikel() {
    }

    public void setArtikel(int nr, String bezeichnung, float preis, int anzahl) {
        if (nr > 0) this.aNr = nr;
        this.aBezeichnung = bezeichnung;
        if (preis > 0) this.aPreis = preis;
        if (anzahl > 0) this.aAnzahl = anzahl;
    }

    public void setNr(int nr) {
        if (nr < 0) {
            this.aNr = 0;
        } else {
            this.aNr = nr;
        }
    }

    public int getNr() {
        return (this.aNr);
    }

    public void setBezeichnung(String bezeichnung) {
        if (bezeichnung != null) this.aBezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return (this.aBezeichnung);
    }

    public void setPreis(int preis) {
        if (preis < 0) {
            this.aPreis = 0;
        } else {
            this.aPreis = preis;
        }
    }

    public float getPreis() {
        return (this.aPreis);
    }

    public String getPreisAsString() {
        String tmpPreis = "";
        tmpPreis = floatAsStr(this.aPreis);
        return (tmpPreis);
    }

    public void setAnzahl(int anzahl) {
        if (anzahl < 0) {
            this.aAnzahl = 0;
        } else {
            this.aAnzahl = anzahl;
        }
    }

    public int getAnzahl() {
        return (this.aAnzahl);
    }

    public float getGesamtpreis() {
        return (this.aPreis * this.aAnzahl);
    }

    public String getGesamtpreisAsStr() {
        String tmpPreis = "";
        tmpPreis = floatAsStr(this.aPreis * this.aAnzahl);
        return (tmpPreis);
    }

    private String floatAsStr(float value) {
        String tmpPreis = "";
        DecimalFormat df = new DecimalFormat("#,##0.00");
        tmpPreis = df.format(value);
        return (tmpPreis);
    }


}
