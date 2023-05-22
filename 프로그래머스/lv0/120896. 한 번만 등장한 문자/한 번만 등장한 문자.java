import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public String solution(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        StringBuffer sb = new StringBuffer();
        for (char ch : hm.keySet()) {
            if (hm.get(ch) == 1) {
                sb.append(ch);
            }
        }

        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);

        String answer = "";
        for (char ch : chars) {
            answer += ch;
        }
        return answer;
    }
}