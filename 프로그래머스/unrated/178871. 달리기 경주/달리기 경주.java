import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players.clone();
        
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < answer.length; i++) {
            hm.put(answer[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            String name = answer[hm.get(callings[i]) - 1];
            
            swap(answer, hm.get(callings[i]), hm.get(callings[i]) - 1);
            hm.put(name, hm.get(name) + 1);
            hm.put(callings[i], hm.get(callings[i]) - 1);
        }
        return answer;
    }
    
    public void swap(String[] arr, int x, int y) {
        String tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}