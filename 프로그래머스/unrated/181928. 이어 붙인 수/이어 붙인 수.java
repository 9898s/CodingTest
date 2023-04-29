class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for(int i : num_list) {
            if(i % 2 == 1) {
                a.append(i);
            } else {
                b.append(i);
            }
        }
        
        answer = Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
        return answer;
    }
}