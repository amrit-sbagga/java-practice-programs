/**
 * Requirement:
 * Convert a non-negative decimal integer to its binary string representation.
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        int nums[] = { 11, 12, 13, 14, 15 };
        for(int num : nums) {
            String binary = decimalToBinary(num);
            System.out.println("Binary representation of " + num + " is " + binary);
        }

    }

    private static String decimalToBinary(int num) {
        if(num == 0) {
            return "0";
        } else if(num == 1) {
            return "1";
        } else {
            return decimalToBinary(num / 2) + (num % 2);
        }
    }
}

// dry run for 11:

// 11 / 2 = 5 remainder 1
// 5 / 2 = 2 remainder 1
// 2 / 2 = 1 remainder 0
// 1 / 2 = 0 remainder 1
// 0 / 2 = 0 remainder 0

// 11 = 1011