package Arrays;

import java.util.Arrays;


/*
    Problem Description:
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each
    unique element appears only once. The relative order of the elements should be kept the same. Then return
    the number of unique elements in nums. Consider the number of unique elements of nums to be k,
    to get accepted, you need to do the following things:

    1. Change the array nums such that the first k elements of nums contain the unique elements in the order
       they were present in nums initially. The remaining elements of nums are not important as well as the
       size of nums.
    2. Return k.




    Solution:
    The idea to use two pointers. We keep one pointer at index 0, say j, and then we traverse on the array from
    index 1 to n. At any point, if the number at index j and the number at index i are not equal, it means that
    we found unique element with respect to the current element at index j. In this case, we first increment the
    value of j by 1 and swap the numbers if index j and i. In the end, we return j + 1 demonstrating that the first
    j + 1 elements in the given array are unique elements.

    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class _0002remove_duplicates_from_rotated_sorted_array {
    static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int j = 0;
        for (int i = 1 ; i < n ; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int index = removeDuplicates(nums);

        System.out.println(index);
        System.out.println(Arrays.toString(nums));
    }
}
