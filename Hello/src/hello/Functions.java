package hello;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        int z1, z2, max;
        Scanner sc = new Scanner(System.in);

        z1 = sc.nextInt();
        z2 = sc.nextInt();

        max = Funktionen.maximum(z1, z2);

        System.out.print(max + " ist das Maximum");

        }
}
