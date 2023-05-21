import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int idx = 0;
        Stack<Integer> stack = new Stack<>();

        while (idx < arr.length) {
            if (stack.isEmpty()) {
                stack.push(arr[idx++]);
            } else {
                if (stack.peek() < arr[idx]) {
                    stack.push(arr[idx++]);
                } else {
                    stack.pop();
                }
            }
        }

        int[] stk = stack.stream().mapToInt(Integer::intValue).toArray();
        return stk;
    }
}