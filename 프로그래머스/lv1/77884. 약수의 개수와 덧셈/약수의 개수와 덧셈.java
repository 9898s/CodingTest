class Solution {
    public static int getDevision(int num) {
        int result = 1;
        for(int i = 1; i <= num / 2; i++) {
            if(num % i == 0) {
                result++;
            }
        }
        return result;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            if(getDevision(i) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}