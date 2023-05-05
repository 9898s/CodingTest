class Solution {
    public String solution(int n) {
        String answer = "";
        
        if(n % 2 == 0) {
            answer = "수박".repeat(n / 2);
        } else {
            answer = "수박".repeat(n / 2 + 1);
            answer = answer.substring(0, answer.length() - 1);
        }
        return answer;
    }
}