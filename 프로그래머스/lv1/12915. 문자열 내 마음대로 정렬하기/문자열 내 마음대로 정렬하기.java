import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = strings;
        
        for (int i = 0; i < answer.length; i++) {
            for (int j = i + 1; j < answer.length; j++) {
                if (answer[i].charAt(n) > answer[j].charAt(n)) {
                    swap(answer, i, j);
                } else if (answer[i].charAt(n) == answer[j].charAt(n)) {
                    String[] tmp = {answer[i], answer[j]};
                    Arrays.sort(tmp);
                    
                    answer[i] = tmp[0];
                    answer[j] = tmp[1];
                }
            }
        }
        return answer;
    }
    
    public void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}