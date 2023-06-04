import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int item : arr) {
            if (item % divisor == 0) {
                list.add(item);
            }
        }
        Collections.sort(list);
        
        int[] answer = new int[]{-1};
        if (!list.isEmpty()) {
            answer = list.stream().mapToInt(Integer::intValue).toArray();
        }
        return answer;
    }
}