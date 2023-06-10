class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            boolean isFlag = false;
            for (int j = i; j <= n; j++) {
                sum += j;
                
                if (sum == n) {
                    isFlag = true;
                    break;
                }
                else if (sum > n) {
                    break;
                }
            }
            
            if (isFlag) {
                answer++;
            }
        }
        return answer;
    }
}