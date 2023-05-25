import java.util.HashMap;

class Solution {
    public String solution(String my_string, int[] indices) {
        HashMap<Integer, Character> hm = new HashMap<>();
        for (int i = 0; i < my_string.length(); i++) {
            hm.put(i, my_string.charAt(i));
        }

        for (int i = 0; i < indices.length; i++) {
            hm.remove(indices[i]);
        }

        StringBuffer sb = new StringBuffer();
        for (int item : hm.keySet()) {
            sb.append(hm.get(item));
        }
        return sb.toString();
    }
}