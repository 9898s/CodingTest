class Solution {
    public long solution(int n) {
        long answer = 0;
        
        long num1 = 1;
        long num2 = 0;
        
        for (int i = 0; i <= n; i++) {
            answer = (num1 + num2) % 1234567;
            num1 = num2;
            num2 = answer;
        }
        return answer;
    }
}