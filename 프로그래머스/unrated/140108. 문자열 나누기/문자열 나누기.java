class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char x = '1';
        int count = 0;
        
        for (char ch : s.toCharArray()) {
            if (x == '1') {
                x = ch;
            }
            
            if (x == ch) {
                count++;
            } else {
                count--;
                
                if (count == 0) {
                    x = '1';
                    answer++;
                }
            }
        }
        
        if (count > 0) {
            answer++;
        }
        return answer;
    }
}