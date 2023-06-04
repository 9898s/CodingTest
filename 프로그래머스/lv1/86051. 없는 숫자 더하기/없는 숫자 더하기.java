class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        boolean[] count = new boolean[10];
        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i]] = true;
        }
        
        for (int i = 0; i < count.length; i++) {
            if (!count[i]) {
                answer += i;
            }
        }
        return answer;
    }
}