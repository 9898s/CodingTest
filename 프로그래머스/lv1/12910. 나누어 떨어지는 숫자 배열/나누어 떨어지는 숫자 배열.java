import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        
        if(list.size() == 0) {
            list.add(-1);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}