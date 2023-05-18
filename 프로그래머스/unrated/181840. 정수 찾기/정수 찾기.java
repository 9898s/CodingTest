class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        
        for (int item : num_list) {
            if(item == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}