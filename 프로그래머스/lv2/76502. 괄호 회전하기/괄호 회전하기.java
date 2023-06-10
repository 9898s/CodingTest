import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Deque<Character> deque = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            deque.add(ch);
        }

        for (int i = 0; i < deque.size(); i++) {
            ArrayList<Character> list = new ArrayList<>();
            for (char ch : deque) {
                list.add(ch);
            }

            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == ']') {
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        stack.push(list.get(j));
                    }
                } else if (list.get(j) == '}') {
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(list.get(j));
                    }
                } else if (list.get(j) == ')') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(list.get(j));
                    }
                } else {
                    stack.push(list.get(j));
                }
            }

            if (stack.isEmpty()) {
                answer++;
            }
            deque.addLast(deque.removeFirst());
        }
        return answer;
    }
}