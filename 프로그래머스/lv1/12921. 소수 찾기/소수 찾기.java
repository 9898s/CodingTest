class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 0; i < n + 1; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }

        for (int i = 2; i < n + 1; i++) {
            if (isPrime[i]) {
                answer++;
            }
        }
        return answer;
    }
}