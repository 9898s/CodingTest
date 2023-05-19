class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int sum = 0;
        
        for (int item : num_list) {
            mul *= item;
            sum += item;
        }
        
        int answer = mul < Math.pow(sum, 2) ? 1 : 0;
        return answer;
    }
}