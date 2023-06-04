import java.util.HashMap;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String s2 = s.toLowerCase();
        int[] arr = new int[2];
        
        for (char ch : s2.toCharArray()) {
            if (ch == 'p') {
                arr[0]++;
            } else if (ch == 'y') {
                arr[1]++;
            }
        }
        
        if (arr[0] != arr[1]) {
            answer = false;
        }
        return answer;
    }
}