import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n);
        for (char ch : str.toCharArray()) {
            answer += ch - '0';
        }
        return answer;
    }
}