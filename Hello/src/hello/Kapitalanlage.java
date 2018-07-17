package hello;

import java.util.Scanner;

public class Kapitalanlage {

    public static void main(String[] arg) {

        double kapital, zinssatz;
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Kapital eingeben: ");
        kapital = sc.nextDouble();
        System.out.println("Zinssatz eingeben: ");
        zinssatz = sc.nextDouble();

        System.out.println("Kapitalanlage");
        System.out.println("Kapital: "+kapital+", Zinssatz: "+zinssatz+"\n");

        for (i=1; i <= 40; i++) {
            kapital = kapital * (1+zinssatz/100);
            if (i % 5 == 0) {
                System.out.println(i+": "+kapital);
            }
        }

    }

}
