package Arrays;

import java.util.HashMap;
import java.util.Map;

/*
    Problem Description:
    Given a non-empty array of integers nums, every element appears twice except for one.
    Find that single one.


    Solution:
    One can use hashmaps to solve this. A clever solution would be to use xor operation. As every element
    appears twice except the one single element, xor of two same numbers is 0 and xor of any number with 0
    is the number itself. So eventually, every number occurring twice will become 0 and the xor of 0 and the
    single number will be the single number itself.

    Time Complexity: O(n) using xor method and O(n + m) using HashMaps, where m is the number of distinct elements in the given array
    Space Complexity: O(1) using xor method and near about O(n / 2) using HashMaps
*/

public class _0008_single_number {
    static int singleNumber(int[] nums) {
        int xor = 0;
        for (int i : nums) {
            xor = xor ^ i;
        }

        return xor;


        // using hashmaps
//        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
//        for (int i : nums) {
//            frequencyMap.put(i, frequencyMap.getOrDefault(i, 0) + 1);
//        }
//
//        System.out.println(frequencyMap);
//
//        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
//            if (entry.getValue() == 1) {
//                return entry.getKey();
//            }
//        }
//
//        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1 ,2};

        int result = singleNumber(nums);
        System.out.println(result);
    }
}
