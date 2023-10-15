package TopInterviewQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class _16_PascalTriangle {
    public static void main(String[] args) {
        int rows = 5;
        System.out.println(pascalTriangle(rows));

    }

    private static List<List<Integer>> pascalTriangle(int rows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < rows; i++){
            List<Integer> currentRow = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if (j == 0 || j == i) {
                    currentRow.add(1);
                }
                else {
                    List<Integer> previousRow = ans.get(i - 1);
                    currentRow.add(previousRow.get(j) + previousRow.get(j - 1));
                }
            }
            ans.add(currentRow);

        }
        return ans;

    }
}
