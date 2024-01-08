import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fazer uma função recursiva que calcule a sequência de Fibonacci");

        System.out.print("Write a number: ");
        Scanner scanner = new Scanner(System.in);
        int numChoice = scanner.nextInt();
        System.out.println(fibonacci(numChoice));
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}