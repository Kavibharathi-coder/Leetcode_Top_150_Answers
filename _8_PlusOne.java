package TopInterviewQuestions;
import java.util.Arrays;

public class _8_PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        System.out.println(Arrays.toString(twoSum(arr)));
    }

    private static int[] twoSum(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--)
        {
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }

        int[] new_arr = new int[arr.length + 1];
        new_arr[0] = 1;
        return new_arr;
    }
}
