class Solution {
    public long solution(long n) {
        long answer = -1;
        
        if (Math.pow(n, 0.5) % 1 == 0) {
            answer = (long) Math.pow(Math.pow(n, 0.5) + 1, 2);
        }
        return answer;
    }
}