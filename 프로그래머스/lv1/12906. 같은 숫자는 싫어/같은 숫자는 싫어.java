import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] arr) {
        int idx = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(arr[0]);
        for(int item : arr) {
            if(list.get(idx) != item) {
                list.add(item);
                idx++;
            }
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}