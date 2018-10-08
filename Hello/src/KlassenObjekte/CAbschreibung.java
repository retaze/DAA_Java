package KlassenObjekte;

public class CAbschreibung {

    private float kaufpreis, abschreibung, restAnfang, restEnde, abschrAnfang, abschrEnde;
    private int nutzungsDauer, jahr;

    public void setAnfang(float kaufpreis, int nutzungsDauer) {
        this.kaufpreis = kaufpreis;
        this.nutzungsDauer = nutzungsDauer;
    }

    public int getNutzungsDauer() {
        return nutzungsDauer;
    }

    public float[] getErsteAbschreibung() {
        float arrAbschr[] = {0, 0, 0, 0, 0, 0};

        this.abschreibung = this.kaufpreis / this.nutzungsDauer;
        this.jahr = 1;
        this.restAnfang = this.kaufpreis;
        this.abschrAnfang = 0;

        this.restEnde = this.restAnfang - this.abschreibung;
        this.abschrEnde = this.abschreibung;

        arrAbschr[0] = this.jahr;
        arrAbschr[1] = this.restAnfang;
        arrAbschr[2] = this.abschreibung;
        arrAbschr[3] = this.restEnde;
        arrAbschr[4] = this.abschrAnfang;
        arrAbschr[5] = this.abschrEnde;
        return arrAbschr;

    }

    public float[] getFolgeAbschreibung() {
        float arrAbschr[] = {0, 0, 0, 0, 0, 0};

        if (this.jahr >= this.nutzungsDauer) return arrAbschr;

        this.jahr = this.jahr + 1;
        this.restAnfang = this.restEnde;
        this.abschrAnfang = this.abschrEnde;

        this.restEnde = this.restAnfang - this.abschreibung;
        this.abschrEnde = this.abschrAnfang + this.abschreibung;

        arrAbschr[0] = this.jahr;
        arrAbschr[1] = this.restAnfang;
        arrAbschr[2] = this.abschreibung;
        arrAbschr[3] = this.restEnde;
        arrAbschr[4] = this.abschrAnfang;
        arrAbschr[5] = this.abschrEnde;
        return arrAbschr;
    }
}
