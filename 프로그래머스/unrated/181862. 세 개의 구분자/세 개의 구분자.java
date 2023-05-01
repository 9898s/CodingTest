import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] text = myStr.split("[abc]+");

        ArrayList<String> texts = new ArrayList<>();
        for (String str : text) {
            if (!str.isEmpty()) {
                texts.add(str);
            }
        }
        if (texts.size() == 0) {
            texts.add("EMPTY");
        }

        String[] answer = new String[texts.size()];
        for (int i = 0; i < texts.size(); i++) {
            answer[i] = texts.get(i);
        }
        return answer;
    }
}