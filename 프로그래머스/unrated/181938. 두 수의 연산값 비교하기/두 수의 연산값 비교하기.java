class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(String.valueOf(a) + b);
        
        int answer = Math.max(ab, 2 * a * b);
        return answer;
    }
}