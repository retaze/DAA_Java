package hello;

public class Vorgabewerte {

    public static void main(String[] args) {

        System.out.println("Prozedur - Vorgabewerte\n");
        test(5, 6, "Hallo");
        test(5, 6);
        test(5);
    }

    public static void test(int a) {
        test(a, 10);

    }

    public static void test(int a, int b) {
        test(a, b, "text");

    }

    public static void test(int a, int b, String c) {
        System.out.println(a + ", " + b + ", " + c);
    }
}
