package hello;

public class BMI {

	public static void main(String[] args) {
		
		int groesse = 187;
		double bmi;
		double gewicht = 67.50;

        bmi = (float) gewicht / (groesse * groesse) * 10000;
		
		System.out.println(bmi);
	}

}
