import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String> queue1 = new LinkedList<>();
        for (String item : cards1) {
            queue1.add(item);
        }
        
        Queue<String> queue2 = new LinkedList<>();
        for (String item : cards2) {
            queue2.add(item);
        }
        
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(queue1.peek())) {
                queue1.remove();
            } else if (goal[i].equals(queue2.peek())) {
                queue2.remove();
            } else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}