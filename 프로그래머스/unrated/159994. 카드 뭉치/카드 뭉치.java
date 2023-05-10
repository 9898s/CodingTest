import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> cQ1 = new LinkedList<>();
        Collections.addAll(cQ1, cards1);

        Queue<String> cQ2 = new LinkedList<>();
        Collections.addAll(cQ2, cards2);

        int count = 0;
        for (String str : goal) {
            if (str.equals(cQ1.peek())) {
                cQ1.poll();
                count++;
            } else if (str.equals(cQ2.peek())) {
                cQ2.poll();
                count++;
            }
        }

        String answer = (count == goal.length) ? "Yes" : "No";
        return answer;
    }
}