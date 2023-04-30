import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] strings = myString.split("x");
        ArrayList<String> text = new ArrayList<>();

        int count = 0;
        for(int i = 0; i < strings.length; i++) {
            if(!strings[i].isEmpty()) {
                text.add(strings[i]);
            }
        }
        
        String[] answer = new String[text.size()];
        for(int i = 0; i < text.size(); i++) {
            answer[i] = text.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}