package Arrays;

import java.util.ArrayList;
import java.util.List;

public class _0024_spiral_matrix {
    static List<Integer> spiralMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        List<Integer> result = new ArrayList<>();

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left ; i <= right ; i++) {
                result.add(mat[top][i]);
            }
            top++;

            // top to bottom
            for (int i = top ; i <= bottom ; i++) {
                result.add(mat[i][right]);
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int i = right ; i >= left ; i--) {
                    result.add(mat[bottom][i]);
                }
            }
            bottom--;

            // bottom to top
            if (left <= right) {
                for (int i = bottom ; i >= top ; i--) {
                    result.add(mat[i][left]);
                }
            }
            left++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20},
        };

        List<Integer> spiralMatrix = spiralMatrix(matrix);
        System.out.println(spiralMatrix);
    }
}
