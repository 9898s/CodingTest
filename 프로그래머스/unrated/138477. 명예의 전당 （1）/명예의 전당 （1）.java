import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < answer.length; i++) {
            list.addFirst(score[i]);
            Collections.sort(list, Collections.reverseOrder());

            if (list.size() < k) {
                answer[i] = list.getLast();
            } else {
                answer[i] = list.get(k - 1);
            }
        }
        return answer;
    }
}