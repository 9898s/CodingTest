class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int item : array) {
            if (item == n) {
                answer++;
            }
        }
        return answer;
    }
}