package Arrays;

/*
    Problem Description:
    You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
    You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
    DO NOT allocate another 2D matrix and do the rotation.



    Solution:
    Since the given matrix is of size n * n, we can transpose the matrix in-place. If the number of rows and
    columns were not equal, we have to create another 2d matrix to transpose it. Once the matrix is transposed,
    we then reverse each row to rotate it by 90 degrees.

    Time Complexity -> O(n^2)
    space Complexity -> O(1)
*/

import java.util.Arrays;

public class _0023_rotate_image {
    static void rotate(int[][] matrix) {
        int n = matrix.length; // matrix is of size n * n, i.e., equal number of rows and columns

        //transposing the matrix
        for (int i = 0 ; i < n ; i++) {
            for (int j = i+1 ; j < n ; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        //reversing each row;
        for(int[] row : matrix) {
            int low = 0, high = n - 1;
            while (low < high) {
                int temp = row[low];
                row[low] = row[high];
                row[high] = temp;
                low++; high--;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate(matrix);

        System.out.println(Arrays.deepToString(matrix));
    }
}
