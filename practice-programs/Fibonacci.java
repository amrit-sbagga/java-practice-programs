/**
 * Requirement:
 * Print the first N numbers of the Fibonacci series (0, 1, 1, 2, 3, 5, ...). Accept N from args or use a sample value.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }

    private static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
