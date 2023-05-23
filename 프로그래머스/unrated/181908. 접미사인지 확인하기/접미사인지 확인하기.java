import java.util.HashMap;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        HashMap<String, String> hm = new HashMap();
        for (int i = 0; i < my_string.length(); i++) {
            String sub = my_string.substring(i, my_string.length());
            hm.put(sub, sub);
        }
        
        if (hm.containsKey(is_suffix)) {
            answer = 1;
        }
        return answer;
    }
}