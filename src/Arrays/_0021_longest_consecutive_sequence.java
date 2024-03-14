package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _0021_longest_consecutive_sequence {
    static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int maxLength = 0;

        for (int val : set) {
            if (!set.contains(val - 1)) {
                int length = 1;
                while (set.contains(val + 1)) {
                    length++;
                    val++;
                }
                maxLength = Math.max(length, maxLength);
            }
        }

        return maxLength;


//        Arrays.sort(nums);

//        int currentEl = nums[0];
//        int length = 1, maxLength = 1;
//
//        for (int i = 1 ; i < n ; i++) {
//            if (nums[i] == currentEl) continue;
//
//            if (nums[i] == currentEl + 1) {
//                length++;
//                currentEl++;
//            } else {
//                length = 1;
//                currentEl = nums[i];
//            }
//
//            maxLength = Math.max(length, maxLength);
//        }
//
//        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        int result = longestConsecutive(nums);
        System.out.println(result);
    }
}
