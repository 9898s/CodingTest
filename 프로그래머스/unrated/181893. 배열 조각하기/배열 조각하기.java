import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            deque.add(arr[i]);
        }

        for (int i = 0; i < query.length; i++) {
            int count = 0;

            if (i % 2 == 0) {
                count = deque.size() - query[i] - 1;
                for (int j = 0; j < count; j++) {
                    deque.removeLast();
                }
            } else {
                count = query[i];
                for (int j = 0; j < count; j++) {
                    deque.removeFirst();
                }
            }
        }
        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}