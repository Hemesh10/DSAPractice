package Arrays;

import java.util.ArrayList;
import java.util.List;

public class _0015_maximum_subarray {
    static int maxSubarray(int[] nums) {
        int n = nums.length;
        int sum = 0, maxSum = Integer.MIN_VALUE;

        int start = -1;
        int ansStart = -1, ansEnd = -1;

        for (int i = 0 ; i < n ; i++) {
            if (sum == 0) start = i;

            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0) {
                sum = 0;
            }
        }

        List<Integer> maxSubarrayList = new ArrayList<>();
        for (int i = ansStart ; i <= ansEnd ; i++) {
            maxSubarrayList.add(nums[i]);
        }

        System.out.println("Subarray with the largest sum : " + maxSubarrayList);

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubarray(nums);
        System.out.println(result);
    }
}
