import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> text = new ArrayList<>();
        for(String str : strArr) {
            if(!str.contains("ad")) {
                text.add(str);
            }
        }
        
        String[] answer = new String[text.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = text.get(i);
        }
        return answer;
    }
}