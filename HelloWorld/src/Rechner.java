import java.util.Scanner;

public class Rechner {

	private static Scanner scanner;

	public static void main(String[] args) {
	double zahl1, zahl2, ergebnis;
	
	scanner = new Scanner(System.in);
	
	System.out.println("Bitte geben Sie die erste Zahl ein");
	zahl1=scanner.nextDouble();
	System.out.println("Bitte geben Sie die zweite Zahl ein");
	zahl2=scanner.nextDouble();
	
	ergebnis=zahl1+zahl2;
	
	System.out.println("Das Ergebnis der Addition beider Zahlen ist " +ergebnis);
	}

}