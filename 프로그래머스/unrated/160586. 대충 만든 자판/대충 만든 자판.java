import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for (String key : keymap) {
            for (char ch : key.toCharArray()) {
                if (hm.containsKey(ch)) {
                    if (hm.get(ch) > key.indexOf(ch)) {
                        hm.put(ch, key.indexOf(ch) + 1);
                    }
                } else {
                    hm.put(ch, key.indexOf(ch) + 1);
                }
            }
        }

        int idx = 0;
        for (String target : targets) {
            int count = 0;
            for (char ch : target.toCharArray()) {
                if (!hm.containsKey(ch)) {
                    count = 0;
                    break;
                } else {
                    count += hm.get(ch);
                }
            }
            answer[idx++] = count == 0 ? -1 : count;
        }
        return answer;
    }
}