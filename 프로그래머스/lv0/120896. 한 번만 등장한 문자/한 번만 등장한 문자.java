import java.util.Arrays;
import java.util.Hashtable;

class Solution {
    public String solution(String s) {
        Hashtable<Character, Integer> ht = new Hashtable<>();

        for (char ch : s.toCharArray()) {
            ht.put(ch, ht.getOrDefault(ch, 0) + 1);
        }

        StringBuffer sb = new StringBuffer();
        for (char ch : ht.keySet()) {
            if (ht.get(ch) == 1) {
                sb.append(ch);
            }
        }

        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);

        String answer = String.valueOf(chars);
        return answer;
    }
}