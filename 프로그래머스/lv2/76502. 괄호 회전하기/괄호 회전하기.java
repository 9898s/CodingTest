import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (checkMatching(sb.toString())) {
                answer++;
            }
            
            sb.append(sb.charAt(0));
            sb.delete(0, 1);
        }
        return answer;
    }
    
    public boolean checkMatching(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char open_ch = stack.pop();
                    if (open_ch == '(' && ch != ')' || open_ch == '[' && ch != ']' || open_ch == '{' && ch != '}') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}