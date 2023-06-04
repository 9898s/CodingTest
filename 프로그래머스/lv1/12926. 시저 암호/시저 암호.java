class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] += n;
                if (chars[i] > 'z') {
                    chars[i] = (char) ('a' + (chars[i] - 'z') - 1);
                }
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] += n;
                if (chars[i] > 'Z') {
                    chars[i] = (char) ('A' + (chars[i] - 'Z') - 1);
                }
            }
        }
        
        answer = String.valueOf(chars);
        return answer;
    }
}