package Arrays;

/*
  Problem Description:
  Given an array nums containing n distinct numbers in the range [0, n],
  return the only number in the range that is missing from the array.


  Solution:
  Since it is given that numbers are in the range of 0 to n (including n) and only one number is missing,
  we can initialize a variation with whose value will be equal to the sum of first n natural numbers. Then
  we keep on decreasing the value of our variable by the numbers present in the array. Eventually, it will
  be equal to the number which was missing because only that number was not subtracted from it during the iteration.

  Time Complexity: O(n)
  Space Complexity: O(1)
*/

public class _0006_missing_number {
  static int missingNumber(int[] nums) {
    int n = nums.length;

    int sum = (n * (n + 1)) / 2;

    for (int i = 0 ; i < n ; i++) {
      sum -= nums[i];
    }

    return sum;
  }

  public static void main(String[] args) {
    int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

    int result = missingNumber(nums);
    System.out.println(result);
  }
}
