package hello;

public class BMI {

	public static void main(String[] args) {
		
		int groesse = 189;
		double bmi;
		double gewicht = 78.00;

        bmi = (float) gewicht / (groesse * groesse) * 10000;
		
		System.out.println(bmi);
	}

}
