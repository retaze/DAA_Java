package hello;
import java.util.Scanner;

public class Dateneingaben {

	public static void main(String[] args) {
		
/* BUFFERED READER
		//Variablendeklaration
		String user;
		String password;
		BufferedReader br;
		
		br = new BufferedReader (new InputStreamReader (System.in));
		
		//Eingabedialog
		try
		{
			System.out.println("Geben Sie hier ihren Benutzernamen ein: ");
			user = br.readLine();
			System.out.println("Geben Sie hier Ihr Passwort ein: ");
			password = br.readLine();
			System.out.println("Bentzername ist "+user+" und Kennwort ist "+password);
						
		}
		catch (Exception ex)
		{
			System.out.println("Fehler: "+ex.getMessage());
		}
		
	}
*/
		
		//SCANNER
		//Variablendeklaration
				String user;
				int password;
				
				Scanner sc = new Scanner(System.in);
				//Eingabedialog

				System.out.println("Geben Sie hier ihren Benutzernamen ein: ");
				user = sc.nextLine();
				System.out.println("Geben Sie hier Ihr Passwort ein: ");
				password = sc.nextInt();
				System.out.println("Benutzername ist "+user+" und Passwort ist "+password);
								
		
				
			}
		
}
