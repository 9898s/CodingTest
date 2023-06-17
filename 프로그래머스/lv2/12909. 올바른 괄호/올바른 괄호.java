import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = checkMatching(s);
        return answer;
    }
    
    public boolean checkMatching(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char open_ch = stack.pop();
                    if (open_ch == '(' && ch != ')') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}