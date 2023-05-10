import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : arr) {
            if(item % divisor == 0) {
                list.add(item);
            }
        }

        if(list.size() == 0) {
            return new int[]{-1};
        }

        Collections.sort(list);
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}