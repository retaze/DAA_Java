package hello;

import java.util.Scanner;

public class Abschreibungsrate {

	public static void main(String[] args) {
		
		int anschaffungWert = 0;
		int abschreibungZeitraum = 0;
		double abschreibungRate = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Anschaffungswert in EUR eingeben: ");
			anschaffungWert = sc.nextInt();
			System.out.println("Abschreibungszeitraum in Jahren angeben: ");
			abschreibungZeitraum = sc.nextInt();
			System.out.println("Anschaffungswert: "+anschaffungWert+" EUR");
			System.out.println("Abschreibungszeitraum: "+abschreibungZeitraum+" Jahre");
			
			abschreibungRate = anschaffungWert/(abschreibungZeitraum*12);
			
			System.out.println("Die monatliche Abschreibung betraegt: "+abschreibungRate+" EUR");
			
		}
		catch (Exception ex)
		{
		System.out.println("Fehler: "+ex.getMessage());
		}
	}

}
