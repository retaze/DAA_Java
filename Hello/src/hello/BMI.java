package hello;

public class BMI {

	public static void main(String[] args) {
		
		int groesse = 187;
		int bmi = 0;
		double gewicht = 67.5;
		
		bmi = (int) ((gewicht*10000)/(groesse*groesse));
		
		System.out.println("Mit einem Körpergewicht von "+gewicht+" kg und einer Körpergröße von "+groesse+" cm haben Sie einen BMI von: "+bmi);
	}

}
