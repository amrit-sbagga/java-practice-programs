/**
 * Requirement:
 * Implement binary search on a sorted int array. Return index or -1 if not
 * found.
 */
public class BinarySearch {

    private static int binarySearch(int nums[], int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
        int target = 66;
        int index = binarySearch(nums, target);
        System.out.println("Index of " + target + " is " + index);
    }
}
