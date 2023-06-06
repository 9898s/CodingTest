import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public String solution(String X, String Y) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : Y.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        ArrayList<Character> list = new ArrayList<>();
        for (char ch : X.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) - 1);
                list.add(ch);

                if (hm.get(ch) <= 0) {
                    hm.remove(ch);
                }
            }
        }
        
        if (list.size() == 0) {
            return "-1";
        }
        if (list.get(0) == '0') {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(list, Collections.reverseOrder());
        for (char ch : list) {
            sb.append(ch);
        }
        
        String answer = sb.toString();
        return answer;
    }
}