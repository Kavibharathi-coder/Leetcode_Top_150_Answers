package TopInterviewQuestions;

public class _7_FindTheIndexOfTheFirstOccuranceInAString {
    public static void main(String[] args) {
        String haystack = "leetcode";
        String needle = "code";

        System.out.println(findOccurance(haystack, needle));
    }

    private static int findOccurance(String haystack, String needle) {
        int j = 0;

        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            else{
                i -= j;
                j = 0;
            }
            if(j == needle.length()){
                return i - j + 1;
            }
        }
        return -1;
    }
}
