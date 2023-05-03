import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> stk = new ArrayList<>();

        while (i < arr.length) {
            if(stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                if(stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                    i++;
                } else {
                    stk.add(arr[i]);
                    i++;
                }
            }
        }
        if(stk.isEmpty()) {
            stk.add(-1);
        }
        
        int[] answer = stk.stream().mapToInt(j -> j).toArray();
        return answer;
    }
}