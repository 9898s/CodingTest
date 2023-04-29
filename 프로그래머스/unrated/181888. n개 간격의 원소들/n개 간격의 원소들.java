import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < num_list.length; i += n) {
            arr.add(num_list[i]);
        }

        int[] answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}