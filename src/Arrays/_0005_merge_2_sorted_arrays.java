package Arrays;

import java.util.Arrays;

/*
    Problem Description:
    Given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
    representing the number of elements in nums1 and nums2 respectively. Merge nums1 and nums2 into a
    single array sorted in non-decreasing order.
    The final sorted array should not be returned by the function, but instead be stored inside the array
    nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements
    that should be merged, and the last n elements are set to 0 and should be ignored. Nums2 has a length of n.



    Solution:
    Initialize three pointers:
    i pointing to the last element in the non-zero part of nums1 (m - 1).
    j pointing to the last element in nums2 (n - 1).
    k pointing to the last index in the merged array (m + n - 1).

   Iterate over nums2 from the end (j) to the beginning (0):
   If nums1[i] is greater than nums2[j] and i is not out of bounds (greater than or equal to 0),then set
   nums1[k] to nums1[i] and decrement both i and k.
   Otherwise, set nums1[k] to nums2[j] and decrement j and k.

   Continue until j is less than 0, which means all elements of nums2 have been merged into nums1.

   Time Complexity: O(m + n)
   Space Complexity: O(1)

*/

public class _0005_merge_2_sorted_arrays {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;

        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
    }
}
