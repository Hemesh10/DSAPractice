package Arrays;

import java.util.Arrays;

public class _0020_replace_elements_with_greatest_element_on_right_side {
    static int[] replaceElements(int[] nums) {
        int n = nums.length, maxN = nums[n - 1];
        nums[n - 1] = -1;

        for (int i = n - 2 ; i >= 0 ; i--) {
            int temp = nums[i];
            nums[i] = maxN;
            maxN = Math.max(maxN, temp);
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};

        int[] result = replaceElements(nums);
        System.out.println(Arrays.toString(result));
    }
}
