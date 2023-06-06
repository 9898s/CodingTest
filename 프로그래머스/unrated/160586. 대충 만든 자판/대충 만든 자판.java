import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                hm.put(keymap[i].charAt(j), Math.min(hm.getOrDefault(keymap[i].charAt(j), 100), j));
            }
        }

        int idx = 0;
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            int sum = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                if (hm.containsKey(targets[i].charAt(j))) {
                    sum += hm.get(targets[i].charAt(j)) + 1;
                } else {
                    sum = Integer.MIN_VALUE;
                }
            }
            answer[idx++] = sum <= 0 ? -1 : sum;
        }
        return answer;
    }
}