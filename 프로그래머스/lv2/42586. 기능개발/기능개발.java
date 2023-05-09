import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            if ((100 - progresses[i]) % speeds[i] == 0) {
                queue.add((100 - progresses[i]) / speeds[i]);
            } else {
                queue.add((100 - progresses[i]) / speeds[i] + 1);
            }
        }

        System.out.println(queue);

        while (!queue.isEmpty()) {
            int day = queue.remove();
            int count = 1;

            while (!queue.isEmpty() && day >= queue.peek()) {
                queue.remove();
                count++;
            }
            list.add(count);
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}