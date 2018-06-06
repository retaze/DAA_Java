package hello;

public class Uebungen2 {

	public static void main(String[] args) {
		/*
		//Variablendefinition
		int anzahl = 0;
		String str = "";
		//Erste Ausgabe
		str = "Der Wert der Variablen \"anzahl\" ist ";
		anzahl = 11;
		System.out.println(str + anzahl);
		//Zweite Ausgabe
		anzahl = 22;
		System.out.println(str + anzahl);
				
		//Zweite Übung
		String name;
		int alter;
		
		name="Jürgen";
		alter=19;
		
		System.out.println("Das Alter von " +name+ " ist " +alter+ ".");
		
		name="Steffi";
		alter=17;
		
		System.out.println("Das Alter von " +name+ " ist " +alter+ ".");
		
		
		//Übung 3.1
		String name;
		String geburtsDatum;
		
		name="Michael";
		geburtsDatum="13.04.1987";
		
		System.out.println(name+ " hat am " +geburtsDatum+ " Geburtstag");
		
		
		//Übung 3.3
		int zeitraum=10;
		float betrag=1000;
		int zinsSatz=4;
		
		System.out.print("Aus "+betrag+" € werden in "+zeitraum+" Jahren bei "+zinsSatz+"%");
		betrag=(float) 1480.24;
		System.out.println(" Zinsen "+betrag+" €.");
		*/
		
		//Numerische Ausdrücke 2.3.4
		final int ANZA=2;
		int anzB=3;
		int anzC=5;
		float betragGesamt=15000;
		float betragA;
		float betragB;
		float betragC;
		int summeAnz;
		
		summeAnz=ANZA+anzB+anzC;
		betragA=betragGesamt/summeAnz*ANZA;
		betragB=betragGesamt/summeAnz*anzB;
		betragC=betragGesamt/summeAnz*anzC;
		
		System.out.println(betragA+" "+betragB+" "+betragC);
		
	}

}
