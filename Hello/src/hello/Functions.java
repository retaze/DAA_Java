package hello;

import java.util.Scanner;

public class Functions {

    public static void main(String[] args) {

        int z1, z2, max;
        Scanner sc = new Scanner(System.in);

        z1 = sc.nextInt();
        z2 = sc.nextInt();

        max = maximum(z1, z2);

        System.out.print(max + " ist das Maximum");

        }

    public static int maximum( int z1, int z2){
        int max = 0;
        if (z1 > z2) {
            max = z1;
        } else {
            max = z2;
        }
        return max;
    }
}