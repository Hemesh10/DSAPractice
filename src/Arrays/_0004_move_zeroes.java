package Arrays;

import java.util.Arrays;

/*

*/

public class _0004_move_zeroes {
    static void moveZeroes(int[] nums) {
        int n = nums.length;

        int nonZeroIndex = 0;
        for (int i = 0 ; i < n ; i++) {
            if (nums[i] != 0) {
                if (i != nonZeroIndex) {
                    //swap
                    int temp = nums[nonZeroIndex];
                    nums[nonZeroIndex] = nums[i];
                    nums[i] = temp;
                }
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }
}
