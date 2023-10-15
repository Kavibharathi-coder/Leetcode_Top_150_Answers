package TopInterviewQuestions;

public class _10_ClimbingStairs {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(climbingStairs(num));
    }

    private static int climbingStairs(int num) {
        if(num == 1) return 1;

        int a = 1;
        int b = 2;
        int count = 2;

        while(count < num)
        {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        return b;
    }
}
