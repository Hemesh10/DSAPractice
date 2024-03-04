package Arrays;

import java.util.ArrayList;
import java.util.List;

public class _0009_longest_subarray_with_sum_k {
    static int longestSubarrayWithLengthK(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        int sum = 0, maxLength = 0;

        List< List<Integer>> list =  new ArrayList<>();

        while (i < n) {
            sum += nums[i];

            while (sum > k) {
                sum -= nums[j];
                j++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, i - j + 1);
                List<Integer> subarrayWithSumK = new ArrayList<>();
                for (int x = j ; x <= i ; x++) {
                    subarrayWithSumK.add(nums[x]);
                }
                list.add(subarrayWithSumK);
            }

            i++;
        }

        System.out.println(list);

        return maxLength;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        int k = 6;

        int result = longestSubarrayWithLengthK(num, k);
        System.out.println(result);
    }
}
