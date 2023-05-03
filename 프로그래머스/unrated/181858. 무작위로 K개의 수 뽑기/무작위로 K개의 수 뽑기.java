import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(!list.contains(i)) {
                list.add(i);
            }
        }
        
        int[] newList = list.stream().mapToInt(i -> i).toArray();
        int[] answer = new int[k];
        
        for(int i = 0; i < k; i++) {
            if(i < newList.length) {
                answer[i] = newList[i];
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}