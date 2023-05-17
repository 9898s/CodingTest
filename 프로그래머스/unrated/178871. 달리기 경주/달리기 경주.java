import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            hm.put(players[i], i);
        }

        for (String item : callings) {
            String name = players[hm.get(item) - 1];
            int rank = hm.get(item);

            hm.put(item, hm.get(name));
            hm.put(name, hm.get(name) + 1);
            swap(players, rank, hm.get(name) - 1);
        }

        String[] answer = new String[players.length];
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            answer[entry.getValue()] = entry.getKey();
        }
        return answer;
    }
    
    public static void swap(String[] arr, int x, int y) {
        String tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}