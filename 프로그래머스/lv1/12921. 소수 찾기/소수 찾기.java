class Solution {
    public static int test(int n) {
        boolean[] isPrime = new boolean[n + 1];
        int primeCount = 0;

        // 초기화: 모든 수를 소수로 가정
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수 개수 세기
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primeCount++;
            }
        }

        return primeCount;
    }
    
    public int solution(int n) {
        int answer = test(n);
        return answer;
    }
}