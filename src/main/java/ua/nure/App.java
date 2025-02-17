package ua.nure;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("5+5=" + sum(5, 5));
    }

    public static int sum(int a, int b) {
        if (a + b > 100) {
            return 100;
        }
        return a + b;
    }
}
