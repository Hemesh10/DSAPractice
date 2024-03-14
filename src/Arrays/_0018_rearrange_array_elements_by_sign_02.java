package Arrays;

import java.util.Arrays;

// The number of positives and negatives are not equal

public class _0018_rearrange_array_elements_by_sign_02 {
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int positivesCount = 0, negativesCount = 0;
        for (int i : nums) {
            if (i > 0) {
                positivesCount++;
            } else {
                negativesCount++;
            }
        }

        int k = Math.min(positivesCount, negativesCount) * 2;
        int x = 0, y = 1;

        int j = 0;
        for (int i = 0 ; i < n && j < k ; i++) {
            if (x < k && nums[i] > 0) {
                result[x] = nums[i];
                nums[i] = 0;
                x += 2;
                j++;
            } else if (y < k + 1) {
                result[y] = nums[i];
                nums[i] = 0;
                y += 2;
                j++;
            }
        }

        for (int num : nums) {
            if (num != 0) {
                result[k] = num;
                k++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -2, 6, 8};

        int[] result = rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
