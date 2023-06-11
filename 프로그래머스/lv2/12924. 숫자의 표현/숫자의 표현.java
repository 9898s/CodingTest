class Solution {
    public int solution(int n) {
        /*
        이중 for문을 돌려서 풀면 된다.
        1. 더 한 값이 n이 될 경우 break
        2. 더 한 값이 n을 넘게 될 경우 break
        */
        
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if(sum > n) {
                    break;
                }
            }
        }
        return answer;
    }
}