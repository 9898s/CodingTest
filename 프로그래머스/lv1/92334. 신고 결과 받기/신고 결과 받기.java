import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> hm = new HashMap<>();
        HashMap<String, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            hm.put(id_list[i], new HashSet<>());
            hm2.put(id_list[i], i);
        }

        for (String s : report) {
            String[] str = s.split(" ");
            hm.get(str[1]).add(str[0]);
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> hs = hm.get(id_list[i]);
            if (hs.size() >= k) {
                for (String str : hs) {
                    answer[hm2.get(str)]++;
                }
            }
        }
        return answer;
    }
}