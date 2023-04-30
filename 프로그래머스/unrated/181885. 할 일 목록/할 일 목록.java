class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int size = 0;
        for(boolean b : finished) {
            if(!b) {
                size++;
            }    
        }
        
        String[] answer = new String[size];
        
        int count = 0;
        for(int i = 0; i < finished.length; i++) {
            if(!finished[i]) {
                answer[count] = todo_list[i];
                count++;
            }
        }
        return answer;
    }
}