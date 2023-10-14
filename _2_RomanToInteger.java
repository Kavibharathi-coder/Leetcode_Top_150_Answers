package TopInterviewQuestions;

public class _2_RomanToInteger {
    public static void main(String[] args) {
        String s = "IX";
        System.out.println(romanToInt(s));
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
    }

    private static int romanToInt(String s) {
        int ans = 0;
        int prev = 0;
        int current = 0;

        for(int i = s.length() - 1; i >= 0; i--)
        {
            char c = s.charAt(i);

            switch(c){
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
            }

            if(prev > current){
                ans -= current;
            }
            else{
                ans += current;
                prev = current;
            }
        }
        return ans;
    }
}
