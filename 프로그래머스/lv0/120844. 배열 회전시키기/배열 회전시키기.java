import java.util.LinkedList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int item : numbers) {
            queue.add(item);
        }

        if (direction.equals("right")) {
            queue.addFirst(queue.removeLast());
        } else if (direction.equals("left")) {
            queue.addLast(queue.removeFirst());
        }
        
        int[] answer = queue.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}