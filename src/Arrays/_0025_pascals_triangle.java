package Arrays;

/*
    Problem Description:
    Given an integer numRows, return the first numRows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it.
*/

import java.util.ArrayList;
import java.util.List;

public class _0025_pascals_triangle {
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0 ; i < numRows ; i++) {
            List<Integer> list = new ArrayList<>();
            int a = 0, b = 1;
            for (int j = 0 ; j < i + 1 ; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int num = result.get(i - 1).get(a++) + result.get(i - 1).get(b++);
                    list.add(num);
                }
            }
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
        int numRows = 6;
        List<List<Integer>> result = generate(numRows);
        System.out.println(result);
    }
}
