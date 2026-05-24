/**
 * Requirement:
 * Check if a number reads the same forward and backward (e.g. 121, 1331).
 */
public class PalindromeNumber {

    private static boolean isPalindromeNumber(int num) {
        int originalNum = num;

        int reversedNum = 0;

        while(num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum == originalNum;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {121, 1331, 12321, 12345};
        for(int num : nums) {
            if(isPalindromeNumber(num)) {
                System.out.println(num + " is a palindrome number");
            } else {
                System.out.println(num + " is not a palindrome number");
            }
        }
    }
}
