package hello;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		double gewicht, groesse, ideal, bmi;
		String bewertung;
		Scanner sc=new Scanner(System.in);

		System.out.println("Gewicht (kg)");
		gewicht = sc.nextDouble();
		System.out.println("Größe (cm)");
		groesse = sc.nextDouble();

		bmi= (gewicht/(groesse*groesse)*10000);
		ideal=22*(groesse*groesse)/10000;

		if (bmi < 20) {
            bewertung="Untergewicht";
        } else {
            if (bmi < 25) {
              bewertung = "Normalgewicht";
            } else {
                if (bmi < 30) {
                    bewertung = "Übergewicht";
                } else {
                    if (bmi < 40) {
                        bewertung = "Adipositas";
                    } else {
                        bewertung = "massive Adipositas";
                    }
                }
            }
        }
        System.out.println("Gewicht (kg): "+gewicht);
        System.out.println("Größe (cm): "+groesse);
        System.out.println("--------------------------");
        System.out.println("BMI "+bmi);
        System.out.println("Sie haben "+bewertung);
        System.out.println("Ihr Idealgewicht bei dem BMI = 22 beträgt "+ideal+" kg");
	}

}
