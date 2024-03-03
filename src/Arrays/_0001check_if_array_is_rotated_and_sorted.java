package Arrays;


/*
    Problem Description:
    Given an array nums, return true if the array was originally sorted in non-decreasing order,
    then rotated some number of positions (including zero). Otherwise, return false.
    There may be duplicates in the original array.


    Solution:
    The idea is to check the number of peaks occurring in the given array. If the array is sorted and rotated,
    then the number of peak elements in the array should not be more than one. If there exists more than one
    peak, then we return false, or true otherwise
*/

public class _0001check_if_array_is_rotated_and_sorted {
    static boolean check(int[] nums) {
        int n = nums.length;

        int peakCount = 0;
        for (int i = 0 ; i < n - 1 ; i++) {
            if (nums[i] > nums[i + 1]) {
                peakCount += 1;
            }
        }

        if (nums[n - 1] > nums[0]) {
            peakCount += 1;
        }

        return peakCount <= 1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};

        boolean result = check(nums);
        System.out.println(result);
    }
}
