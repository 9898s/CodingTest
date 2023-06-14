import java.util.Deque;
import java.util.Stack;
import java.util.LinkedList;

class Solution {
    public int solution(String s) {
        /*
        1. 문자열 길이 만큼 Deque를 이용해서 왼쪽으로 회전 시켜준다.
        2. 회전 시킬때마다 Stack을 이용해서 올바른 괄호 문자열인지 확인해준다.
        */
        
        int answer = 0;
        
        Deque<Character> deque = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            deque.add(ch);
        }
        
        for (int i = 0; i < deque.size(); i++) {
            deque.addLast(deque.removeFirst());
            
            Stack<Character> stack = new Stack<>();
            for (char ch : deque) {
                if (ch == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.add(ch);
                    }
                } else if (ch == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.add(ch);
                    }
                } else if (ch == '}') {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.add(ch);
                    }
                } else {
                    stack.add(ch);
                }
            }
            
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}