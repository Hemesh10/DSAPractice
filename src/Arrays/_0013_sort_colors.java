package Arrays;

import java.util.Arrays;

public class _0013_sort_colors {
    static void sortColors(int[] nums) {
        int zeroesCount = 0, onesCount = 0;
        for (int i : nums) {
            if (i == 0) {
                zeroesCount++;
            } else if (i == 1) {
                onesCount++;
            }
        }

        int i = 0;
        while (i < nums.length) {
            if (i < zeroesCount) {
                nums[i] = 0;
            } else if (i < zeroesCount + onesCount) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }

            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
