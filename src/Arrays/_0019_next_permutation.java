package Arrays;

import java.util.Arrays;

public class _0019_next_permutation {
    static int[] nextPermutation(int[] arr) {
        int n = arr.length;
        int breakIndex = -1;

        for (int i = n - 2 ; i >= 0 ; i--) {
            if (arr[i] < arr[i + 1]) {
                breakIndex = i;
                break;
            }
        }

        for (int i = n - 1 ; i >= breakIndex + 1 && breakIndex != -1 ; i--) {
            if (arr[i] > arr[breakIndex]) {
                int temp = arr[i];
                arr[i] = arr[breakIndex];
                arr[breakIndex] = temp;
                break;
            }
        }

        int low = breakIndex + 1, high = n - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};

        int[] result = nextPermutation(arr);
        System.out.println(Arrays.toString(result));
    }
}
