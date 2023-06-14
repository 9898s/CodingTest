import java.util.Stack;

class Solution {
    public int solution(String s) {
        /*
        1. 문자열 길이 만큼 Deque를 이용해서 왼쪽으로 회전 시켜준다.
        2. 회전 시킬때마다 Stack을 이용해서 올바른 괄호 문자열인지 확인해준다.
        */
        
        int answer = 0;
        
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            sb.append(sb.charAt(0));
            sb.delete(0, 1);
            
            Stack<Character> stack = new Stack<>();
            for (char ch : sb.toString().toCharArray()) {
                if (!stack.isEmpty()) {
                    if (ch == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else if (ch == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if (ch == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                } else {
                    stack.push(ch);
                }
            }
            
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}