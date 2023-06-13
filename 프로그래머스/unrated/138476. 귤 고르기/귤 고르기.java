import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int k, int[] tangerine) {
        /*
        귤의 종류와 개수를 카운트 해준다.
        개수를 기준으로 오름차순 정렬을 해준다.
        k의 개수와 귤의 개수를 비교해서 최솟값을 구해준다.
        */
        
        int answer = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int item : tangerine) {
            hm.put(item, hm.getOrDefault(item, 0) + 1);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int item : hm.keySet()) {
            list.add(hm.get(item));
        }
        Collections.sort(list);
        
        int idx = list.size() - 1;
        while (k > 0) {
            k -= list.get(idx);
            idx--;
            answer++;
        }
        return answer;
    }
}