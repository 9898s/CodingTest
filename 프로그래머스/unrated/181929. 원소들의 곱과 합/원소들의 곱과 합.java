class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        int mul = 1;
        for (int item : num_list) {
            sum += item;
            mul *= item;
        }
        
        answer = mul < Math.pow(sum, 2) ? 1 : 0;
        return answer;
    }
}