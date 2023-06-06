class Solution {
    public int solution(String s) {
        if (s.length() == 1) {
            return 1;
        }
        
        int answer = 0;
        char[] chars = s.toCharArray();
        
        char x = chars[0];
        int count = 1;
        
        for (int i = 1; i < chars.length; i++) {
            if (x == '1') {
                x = chars[i];
            }
            
            if (chars[i] == x) {
                count++;
            } else {
                count--;
                
                if (count == 0) {
                    x = '1';
                    answer++;
                }
            }
            
            if (i == chars.length - 1) {
                if (count > 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}