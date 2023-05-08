import java.util.Stack;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(stack.get(stack.size() - 1) != arr[i]) {
                stack.add(arr[i]);
            }
        }
        
        int[] answer = stack.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}