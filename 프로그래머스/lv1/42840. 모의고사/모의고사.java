import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        /*
        1: 1, 2, 3, 4, 5
        2: 2, 1, 2, 3, 2, 4, 2, 5
        3: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
        */
        
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] person = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (A[i % 5] == answers[i]) {
                person[0]++;
            }
            if (B[i % 8] == answers[i]) {
                person[1]++;
            }
            if (C[i % 10] == answers[i]) {
                person[2]++;
            }
        }
        
        int max = 0;
        for (int i = 0; i < person.length; i++) {
            max = Math.max(max, person[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < person.length; i++) {
            if (max == person[i]) {
                list.add(i + 1);
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}