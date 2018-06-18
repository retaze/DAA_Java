package hello;

public class BMI {

	public static void main(String[] args) {
		
		int groesse = 187;
		double bmi = 0;
		double gewicht = 67.50;
		
		bmi = (int) gewicht/(groesse*groesse)*10000;
		
		System.out.println(bmi);
	}

}
