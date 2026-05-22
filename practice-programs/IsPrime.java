/**
 * Requirement:
 * Check whether a given integer is prime. Print true/false.
 */
public class IsPrime {

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num1 = 18;
        boolean isPrime = isPrime(num1);
        System.out.println("Is " + num1 + " prime? " + isPrime);
    
        int num2 = 19;
        boolean isPrime2 = isPrime(num2);
        System.out.println("Is " + num2 + " prime? " + isPrime2);
    }
}
