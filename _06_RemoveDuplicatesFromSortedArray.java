package TopInterviewQuestions;

public class _06_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }

    private static int removeDuplicates(int[] arr) {
        int j = 1;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1])
            {
                arr[j++] = arr[i + 1];
            }
        }
        return j;
    }
}
