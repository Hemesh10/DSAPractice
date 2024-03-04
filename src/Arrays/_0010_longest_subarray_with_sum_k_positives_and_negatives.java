package Arrays;

import java.util.HashMap;

public class _0010_longest_subarray_with_sum_k_positives_and_negatives {
    static int longestSubarrayWithSumK(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLength = Math.max(maxLength, i + 1);
            }

            int rem = sum - k;

            if (map.containsKey(rem)) {
                int length = i - map.get(rem);
                maxLength = Math.max(length, maxLength);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;

        int result = longestSubarrayWithSumK(nums, k);
        System.out.println(result);
    }
}
