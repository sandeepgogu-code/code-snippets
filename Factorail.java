// Factorial Program in Java
import java.util.Scanner;

public class Factorial {
    
    // Iterative method
    public static long factorialIterative(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Recursive method
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factorial (Iterative): " + factorialIterative(num));
        System.out.println("Factorial (Recursive): " + factorialRecursive(num));

        sc.close();
    }
}
