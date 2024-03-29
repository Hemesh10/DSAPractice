package Arrays;

import java.util.HashMap;

public class _0011_subarray_sum_equals_k {
    static int subarraySumEqualsK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, count = 0;

        map.put(0, 1);
        for (int i : nums) {
            prefixSum += i;
            int rem = prefixSum - k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;

    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int k = 1;

        int result = subarraySumEqualsK(nums, k);
        System.out.println(result);
    }
}
