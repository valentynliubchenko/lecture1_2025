package ua.nure;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int sum(int a, int b) {
        if(a + b > 100){
            return 100;
        }
        return a + b;
    }
}
