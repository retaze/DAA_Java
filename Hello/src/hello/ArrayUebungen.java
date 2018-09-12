package hello;

public class ArrayUebungen {

    public static void main(String args[]) {

        int arr[] = {24, 4, 69, 49, 31, 87, 37, 64, 9, 40, 65, 51, 0};
        int i = 0, sum = arr[0], anz = 0, max = arr[0], min = arr[0];
        float mittelW = 0.f;

        for (i = 1; i < 13; i++) {
            sum = sum + arr[i];
            anz = anz + 1;

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        mittelW = sum / anz;
        System.out.println("Statistische Auswertung:\n");
        System.out.println("Summe: " + sum + ", Anzahl: " + anz + ", Max.: " + max + ", Min.: " + min + ", Mittwelwert: " + mittelW);


    }
}
