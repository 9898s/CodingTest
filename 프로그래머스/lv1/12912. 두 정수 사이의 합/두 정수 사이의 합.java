class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a < b) {
            answer = (long)(a + b) * (b - a + 1) / 2;
        } else {
            answer = (long)(a + b) * (a - b + 1) / 2;
        }
        return answer;
    }
}