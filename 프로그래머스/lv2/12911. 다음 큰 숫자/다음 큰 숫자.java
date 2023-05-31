class Solution {
    public int solution(int n) {
        int answer = n;
        
        while (Integer.bitCount(n) != Integer.bitCount(++answer)) {
        }
        return answer;
    }
}