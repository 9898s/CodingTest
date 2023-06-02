import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < people.length; i++) {
            deque.add(people[i]);
        }

        while (deque.size() > 0) {
            if (deque.getFirst() + deque.getLast() <= limit) {
                deque.removeFirst();

                if (!deque.isEmpty()) {
                    deque.removeLast();
                }
            } else {
                deque.removeLast();
            }
            answer++;
        }
        return answer;
    }
}