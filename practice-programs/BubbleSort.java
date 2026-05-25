import java.util.Arrays;

/**
 * Requirement:
 * Sort an int array using bubble sort. Print sorted array.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(nums);
        System.out.println("Sorted array: " + Arrays.toString(nums));
    }

    private static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
}
