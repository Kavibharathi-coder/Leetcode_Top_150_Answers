package TopInterviewQuestions;

public class _09_Sqrt {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(squareRoot(num));
    }

    private static int squareRoot(int num) {
        long left = 0;
        long right = num;

        while(left + 1 < right){
            long mid = left + (right - left) / 2;

            if(mid * mid == num) return (int)mid;

            else if(mid * mid < num){
                left = mid;
            }
            else{
                right = mid;
            }
        }
        if(right * right == num){
            return (int)right;
        }
        return (int)left;
    }
}
