import java.util.ArrayList;

class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < picture.length; i++) {
            String text = "";
            for(int j = 0; j < picture[i].length(); j++) {
                text += String.valueOf(picture[i].charAt(j)).repeat(k);
            }
            for(int l = 0; l < k; l++) {
                list.add(text);
            }
        }
        
        String[] answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}