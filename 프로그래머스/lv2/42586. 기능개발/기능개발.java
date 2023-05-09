import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();

        int size = 0;
        for (int i = 0; i < progresses.length; i++) {
            int num = 0;
            if ((100 - progresses[i]) % speeds[i] == 0) {
                num = (100 - progresses[i]) / speeds[i];
            } else {
                num = (100 - progresses[i]) / speeds[i] + 1;
            }

            if (!stack.isEmpty() && stack.peek() >= num) {
                stack.add(stack.peek());
            } else {
                stack.add(num);
                size++;
            }
        }

        int idx = 0;
        int[] answer = new int[size];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1;
        }

        for (int i = 0; i < stack.size() - 1; i++) {
            if (stack.get(i) == stack.get(i + 1)) {
                answer[idx]++;
            } else {
                idx++;
            }
        }
        return answer;
    }
}