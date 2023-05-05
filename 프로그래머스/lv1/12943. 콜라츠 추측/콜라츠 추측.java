class Solution {
    public int solution(int num) {
        int answer = -1;
        
        double num2 = num;
        for(int i = 0; i < 500; i++) {
            if(num2 == 1) {
                return i;
            }
            
            num2 = (num2 % 2 == 0) ? num2 / 2.0 : num2 * 3.0 + 1;
        }
        return answer;
    }
}