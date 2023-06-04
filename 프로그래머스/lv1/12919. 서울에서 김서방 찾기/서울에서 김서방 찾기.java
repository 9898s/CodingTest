import java.util.HashMap;

class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < seoul.length; i++) {
            hm.put(seoul[i], i);
        }
        
        answer = String.format("김서방은 %d에 있다", hm.get("Kim"));
        return answer;
    }
}