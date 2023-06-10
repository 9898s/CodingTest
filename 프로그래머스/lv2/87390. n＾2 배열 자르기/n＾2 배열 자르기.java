import java.util.ArrayList;

class Solution {
    public int[] solution(int n, long left, long right) {
        ArrayList<Long> list = new ArrayList<>();
        for (long i = left; i < right + 1; i++) {
            list.add(Math.max(i / n, i % n) + 1);
        }

        int[] answer = list.stream().mapToInt(Long::intValue).toArray();
        return answer;
    }
}