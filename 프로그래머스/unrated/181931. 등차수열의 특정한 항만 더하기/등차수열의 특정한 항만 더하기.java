class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        
        int sum = a;
        for(boolean bl : included) {
            if(bl) {
                answer += sum;
            }
            sum += d;
        }
        return answer;
    }
}