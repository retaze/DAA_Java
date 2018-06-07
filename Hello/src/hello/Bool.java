package hello;

public class Bool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			  int a = 5;
			  int b = -2;
			  int c = -1;

			  System.out.println(a + " >= 0 && " + a + " <= 10: " +
			                       (a >= 0 && a <= 10 ? "TRUE" : "FALSE"));
			  System.out.println(a + " < 0 || " + a + " > 10: " +
			                       (a < 0 || a > 10 ? "TRUE" : "FALSE"));
			  System.out.println("!(" + a + " < 0): " +
			                       (!(a < 0) ? "TRUE" : "FALSE"));
			  System.out.println("5 * " + b + " 3 > " + a + " && " + c + " < 0: " +
			                       (5 * b + 3 > a && c < 0 ? "TRUE" : "FALSE"));
			  System.out.println(a + " % 2 " + " == 1: " + 
			                       (a % 2 == 1 ? "TRUE" : "FALSE"));
			  System.out.println("!(" + b + " > 5): " +
			                       (!(b > 5) ? "TRUE" : "FALSE")); 
	}

}
