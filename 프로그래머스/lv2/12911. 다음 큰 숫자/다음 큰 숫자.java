class Solution {
    public int solution(int n) {
        /*
        Integer.bitCount를 이용해서 풀었다.
        */
        
        int answer = n + 1;
        while (Integer.bitCount(n) != Integer.bitCount(answer)) {
            answer++;
        }
        return answer;
    }
}