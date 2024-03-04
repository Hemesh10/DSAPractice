package Arrays;

public class _0007_max_consecutive_ones {
    static int maxConsecutiveOnes(int[] nums) {
//        int count = 0, maxCount = 0;
//        for (int i : nums) {
//            if (i == 0) {
//                maxCount = Math.max(maxCount, count);
//                count = 0;
//            } else {
//                count++;
//            }
//        }
//
//        return Math.max(count, maxCount);

        int j = -1, max = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, i - j - 1);
                j = i;
            }
        }

        return Math.max(max, nums.length - j - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 1, 0, 1, 1, 1, 1};

        int result = maxConsecutiveOnes(nums);
        System.out.println(result);
    }
}
