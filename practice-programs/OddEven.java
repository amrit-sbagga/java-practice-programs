/**
 * Requirement:
 * Check whether a given integer is odd or even. Print the result.
 */
public class OddEven {

    public static void main(String[] args) {
        // Your code here

        int[] numbers = { 20, 21, 22, 23, 24 };

        for(int num: numbers) {
            if(num % 2 == 0) {
                System.out.println(num + " is even!");
            } else {
                System.out.println(num + " is odd!");
            }
        }
    }
}
