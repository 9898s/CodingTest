import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        for (int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                int size = list.size() - query[i] - 1;
                for (int j = 0; j < size; j++) {
                    list.remove(list.size() - 1);
                }
            } else {
                for (int j = 0; j < query[i]; j++) {
                    list.remove(0);
                }
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}