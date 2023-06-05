class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int maxIdx = 0;
        for (int item : section) {
            if (maxIdx <= item) {
                maxIdx = item + m;
                answer++;
            }
        }
        return answer;
    }
}