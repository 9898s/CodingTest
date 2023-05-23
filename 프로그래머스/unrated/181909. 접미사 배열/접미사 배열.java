import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.toCharArray().length];
        
        answer[0] = my_string;
        for (int i = 1; i < my_string.length(); i++) {
            answer[i] = my_string.substring(my_string.length() - i);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}