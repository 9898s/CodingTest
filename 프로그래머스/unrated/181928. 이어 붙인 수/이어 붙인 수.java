class Solution {
    public int solution(int[] num_list) {
        StringBuffer odd = new StringBuffer();
        StringBuffer even = new StringBuffer();
        
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                odd.append(num_list[i]);
            } else {
                even.append(num_list[i]);
            }
        }
        
        int answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }
}