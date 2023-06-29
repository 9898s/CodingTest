import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int item : priorities) {
            priorityQueue.add(item);
        }

        int answer = 0;
        while (!priorityQueue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == priorityQueue.peek()) {
                    priorityQueue.poll();
                    answer++;

                    if (i == location) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}