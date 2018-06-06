package hello;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		String name;
		String alter;
		String ort;
		Scanner s = new Scanner(System.in);
				
		System.out.println("Bitte geben Deinen Namen ein:");
		name = s.nextLine();
		System.out.println("Wie alt bist du?");
		alter = s.nextLine();
		System.out.println("Wo wohnst du?");
		ort = s.nextLine();
		System.out.println("Hallo "+name+". Du bist "+alter+" Jahre alt und wohnst in "+ort);		
		
		
		
		
	}

}
