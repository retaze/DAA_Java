import java.util.*;

public class Rechner2
{ 

    private static Scanner s;

	public static void main (String[] args) 
    { 
        double a,b;
        double ausgabe=0.00;
        char rechenop;
        s = new Scanner (System.in);
        
        System.out.print("Geben Sie Zahl 1 ein: ");
            a = s.nextInt();
        System.out.print("Geben sie den Rechenoperator ein: ");
           	rechenop = s.next().charAt(0);
        System.out.print("Geben Sie Zahl 2 ein: ");
            b = s.nextInt();
 
          
            
        System.out.println();
        
        switch (rechenop)
        {
        case '+':
            ausgabe = a+b;
            System.out.print("Das Ergebnis lautet: " +ausgabe);
            break;
        case '-':
            ausgabe = a-b;
            System.out.print("Das Ergebnis lautet: " +ausgabe);
            break;
        case '*':
            ausgabe = a*b;
            System.out.print("Das Ergebnis lautet: " +ausgabe);
            break;
        case '/':
            ausgabe = a/b;
            System.out.print("Das Ergebnis lautet: " +ausgabe);
            break;
        default:
            System.out.print("Falsche Eingabe");
            break;
        }
        
                
                
        } 
}