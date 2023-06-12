import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        /*
        1. 스택에 문자열을 문자를 하나씩 넣어준다.
        2. 스택의 peek 값이 넣을 문자와 같을 경우 pop 해준다.
        3. 아닐 경우 해당 문자를 push 해준다.
        */
        
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        
        if (stack.isEmpty()) {
            answer = 1;
        }
        return answer;
    }
}