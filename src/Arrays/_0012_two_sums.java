package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class _0012_two_sums {
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        for (int i = 0 ; i < n ; i++) {
            int requiredSum = target - nums[i];
            if (map.containsKey(requiredSum)) {
                return new int[]{i, map.get(requiredSum)};
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
