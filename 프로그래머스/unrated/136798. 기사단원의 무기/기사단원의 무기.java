class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (divisor(i) > limit) {
                answer += power;
            } else {
                answer += divisor(i);
            }
        }
        return answer;
    }
    
    public static int divisor(int number) {
        int result = 0;
        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number / i == i && number % i == 0) {
                result++;
            } else if (number % i == 0) {
                result += 2;
            }
        }
        return result;
    }
}