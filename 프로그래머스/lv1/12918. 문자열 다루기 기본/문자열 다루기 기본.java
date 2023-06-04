class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if (s.length() == 4 || s.length() == 6) {
            for (char ch : s.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    return false;
                }
            }
            answer = true;
        }
        return answer;
    }
}