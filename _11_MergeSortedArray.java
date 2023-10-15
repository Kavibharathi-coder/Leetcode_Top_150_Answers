package TopInterviewQuestions;

import java.util.Arrays;

public class _11_MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 0, 0, 0};
        int[] arr2 = {3, 5, 6};
        int m = 3;
        int n = 3;
        mergeSortedArray(arr1, arr2, m, n);
    }

    private static void mergeSortedArray(int[] arr1, int[] arr2, int m, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int k = m + n - 1;

        while (ptr2 >= 0)
        {
            if(ptr1 >= 0 && arr1[ptr1] > arr2[ptr2])
            {
                arr1[k--] = arr1[ptr1--];
            }
            else {
                arr1[k--] = arr2[ptr2--];
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
