import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 2; i++) {
            for(int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                numbers.add(arr[j]);
            }
        }
        
        int[] answer = numbers.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}