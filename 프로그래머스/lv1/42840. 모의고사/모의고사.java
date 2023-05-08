class Solution {
    public int[] solution(int[] answers) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};


        int[] answer = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (A[i % 5] == answers[i]) {
                answer[0]++;
            }
            if (B[i % 8] == answers[i]) {
                answer[1]++;
            }
            if (C[i % 10] == answers[i]) {
                answer[2]++;
            }
        }

        if(answer[0] > answer[1] && answer[0] > answer[2]) {
            answer = new int[]{1};
        } else if(answer[1] > answer[0] && answer[1] > answer[2]) {
            answer = new int[]{2};
        } else if(answer[2] > answer[0] && answer[2] > answer[1]) {
            answer = new int[]{3};
        } else if(answer[0] == answer[1] && answer[1] != answer[2]) {
            answer = new int[]{1, 2};
        } else if(answer[0] == answer[2] && answer[0] != answer[1]) {
            answer = new int[]{1, 3};
        } else if(answer[1] == answer[2] && answer[0] != answer[1]) {
            answer = new int[]{2, 3};
        } else if(answer[0] == answer[1] && answer[1] == answer[2]) {
            answer = new int[]{1, 2, 3};
        }
        return answer;
    }
}