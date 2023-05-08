import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        boolean answer = true;

        for (char c : s.toCharArray()) {
            if(c == '(') {
                stack.add(c);
            } else {
                if(stack.isEmpty()) {
                    answer = false;
                    break;
                }
                
                stack.pop();
            }
        }

        if(!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}