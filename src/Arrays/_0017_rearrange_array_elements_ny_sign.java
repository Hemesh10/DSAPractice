package Arrays;

// The Number of positives and negatives are equal

import java.util.Arrays;

public class _0017_rearrange_array_elements_ny_sign {
    static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result =  new int[n];
        int x = 0, y = 1;

        for (int i : nums) {
            if (i < 0) {
                result[y] = i;
                y += 2;
            } else {
                result[x] = i;
                x += 2;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};

        int[] result = rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }
}
