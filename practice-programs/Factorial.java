import java.math.BigInteger;

/**
 * Requirement:
 * Compute factorial of n (n!). Handle n = 0. Use iterative or recursive
 * approach.
 */
public class Factorial {

    private static BigInteger findFactorial(BigInteger n) {
        if (n.signum() < 0) {
            throw new IllegalArgumentException("n must be >= 0, got: " + n);
        }
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }
        return n.multiply(findFactorial(n.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {

        int n = 25;
        BigInteger factorial = findFactorial(BigInteger.valueOf(n));
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
