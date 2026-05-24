/**
 * Requirement:
 * Check if a number is an Armstrong number (sum of digits^digitCount equals the number, e.g. 153).
 */
public class ArmstrongNumber {

    private static boolean isArmstrongNumber(int num) {
        int originalNum = num;

        int sum = 0;

        int digitCount = String.valueOf(num).length();

        while(num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNum;

    }

    public static void main(String[] args) {
        
        int[] nums = new int[] {153, 172, 370, 371, 407};
        
        for(int num : nums) {
            if(isArmstrongNumber(num)) {
                System.out.println(num + " is an Armstrong number");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }

    }
}
