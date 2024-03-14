package Arrays;

public class _0014_majority_element {
    static int majorityElement(int[] nums) {
        int n = nums.length;
        int currEl = nums[0], count = 1;

        for (int i = 1 ; i < n ; i++) {
            if (nums[i] == currEl) {
                count++;
            } else if (count == 0) {
                currEl = nums[i];
                count = 1;
            } else {
                count--;
            }
        }

        return currEl;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        int result = majorityElement(nums);
        System.out.println(result);
    }
}
