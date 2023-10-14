package TopInterviewQuestions;

import java.util.Stack;

public class _4_ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}[";
        System.out.println(validParanteses(s));
    }

    private static boolean validParanteses(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    char c = stack.peek();
                    stack.pop();
                    if((s.charAt(i) == ')' && c == '(') || (s.charAt(i) == '}' && c == '{') || (s.charAt(i) == ']' && c == '['))
                    {
                        continue;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        return false;
    }
}
