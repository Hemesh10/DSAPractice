package Arrays;

/*
    Problem Description:
    Given an m x n integer matrix 'matrix', if an element is 0, set its entire row and column to 0's.
    You must do it in place.


    Solution:
    Time Complexity -> O (n * m);
    Space Complexity -> O(n + m)
*/

import java.util.Arrays;

public class _0022_set_matrix_zeroes {
    static void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        boolean[] isRowZero = new boolean[n];
        boolean[] isColumnZero = new boolean[m];

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (matrix[i][j] == 0) {
                    isRowZero[i] = true;
                    isColumnZero[j] = true;
                }
            }
        }

        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < m ; j++) {
                if (isRowZero[i] || isColumnZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        setZeroes(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }
}
