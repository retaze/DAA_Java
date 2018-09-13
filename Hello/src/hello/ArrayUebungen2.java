package hello;

public class ArrayUebungen2 {

    public static void main(String args[]) {

        int aDat[] = {1, 1, 2, 4, 2, 3, 3, 4, 2, 1, 2, 2, 4, 4};
        int aAnz[] = {0, 0, 0, 0};
        int i = 0;

        for (i = 0; i < 14; i++) {
            aAnz[aDat[i] - 1] = aAnz[aDat[i] - 1] + 1;
        }
        System.out.println("Statistische Auswertung:\n");
        for (i = 1; i <= 4; i++)
            System.out.println(i + " => " + aAnz[i-1]);
    }


}
