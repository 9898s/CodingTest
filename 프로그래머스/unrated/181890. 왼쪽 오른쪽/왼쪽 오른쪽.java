import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        int left = -1, right = -1;
        for(int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")) {
                if(left == -1) {
                    left = i;
                }
            } else if(str_list[i].equals("r")) {
                if(right == -1) {
                    right = i;
                }
            }
        }

        ArrayList<String> text = new ArrayList<>();
        if(left == -1 && right == -1) {
            text.clear();
        } else if(left == -1) {
            for(int i = right + 1; i < str_list.length; i++) {
                text.add(str_list[i]);
            }
        } else if(right == -1) {
            for(int i = 0; i < left; i++) {
                text.add(str_list[i]);
            }
        } else if(left < right) {
            for(int i = 0; i < left; i++) {
                text.add(str_list[i]);
            }
        } else if(left > right) {
            for(int i = right + 1; i < str_list.length; i++) {
                text.add(str_list[i]);
            }
        }
        System.out.println(text);

        String[] answer = new String[text.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = text.get(i);
        }
        return answer;
    }
}