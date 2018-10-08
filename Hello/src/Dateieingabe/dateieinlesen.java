package Dateieingabe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class dateieinlesen {

    public static void main(String args[]) throws IOException {

        try {
            //schreiben
            String text = "Bla";

            FileOutputStream schreibestrom = new FileOutputStream("C:\\test_java.txt");

            for (int i = 0; i < text.length(); i++ ) {
                schreibestrom.write((byte) text.charAt(i));
            }
            schreibestrom.close();

            // lesen
            Scanner sc = new Scanner(new File("C:\\test_java.txt"), "UTF-8");

            int i;
            double d;

            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                    i = sc.nextInt();
                    System.out.println("Integer: " + ++i);
                } else if (sc.hasNextDouble()) {
                    d = sc.nextDouble();
                    System.out.println("Double: " + ++d);
                } else {
                    System.out.println("String: " + sc.next());

                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }


}
