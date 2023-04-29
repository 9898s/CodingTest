class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        
        for(int i = 0; i < answer.length; i++) {
            if(i == answer.length - 1) {
                if(num_list[answer.length - 2] > num_list[answer.length - 3]) {
                    answer[i] = num_list[answer.length - 2] - num_list[answer.length - 3];
                } else {
                    answer[i] = num_list[answer.length - 2] * 2;
                }
            } else {
                answer[i] = num_list[i];
            }
        }
        return answer;
    }
}