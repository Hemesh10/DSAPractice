package Arrays;

/*
    Problem Description:
    Given an integer rowIndex, return the rowIndex^th (0-indexed) row of the Pascal's triangle.

    Solution:
    Time Complexity: O(rowIndex)
    Space Complexity: O(rowIndex+1)
*/

import java.util.ArrayList;
import java.util.List;

public class _0026_pascals_triangle_2 {
    static List<Integer> generateRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        result.add(1);
        for (int i = 1 ; i <= rowIndex ; i++) {
            long num = (long) result.get(i - 1) * (rowIndex - (i - 1));
            num /= i;
            result.add((int) num);
        }

        return result;
    }

    public static void main(String[] args) {
        int rowIndex = 2;
        List<Integer> row = generateRow(rowIndex);
        System.out.println(row);
    }
}
