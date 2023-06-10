import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack();
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push('(');
            }
        }
        return stack.size() == 0;
    }
}