import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int item : tangerine) {
            hm.put(item, hm.getOrDefault(item, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : hm.keySet()) {
            list.add(hm.get(item));
        }
        Collections.sort(list, Collections.reverseOrder());
        
        for (int i = 0; i < list.size(); i++) {
            k -= list.get(i);
            answer++;
            
            if (k <= 0) {
                break;
            }
        }
        return answer;
    }
}