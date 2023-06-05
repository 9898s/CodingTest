import java.util.HashMap;

class Solution {
    public int solution(String s) {
        int answer = 0;

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("zero", 0);
        hm.put("one", 1);
        hm.put("two", 2);
        hm.put("three", 3);
        hm.put("four", 4);
        hm.put("five", 5);
        hm.put("six", 6);
        hm.put("seven", 7);
        hm.put("eight", 8);
        hm.put("nine", 9);

        for (String str : hm.keySet()) {
            s = s.replace(str, String.valueOf(hm.get(str)));
        }
        
        answer = Integer.parseInt(s);
        return answer;
    }
}