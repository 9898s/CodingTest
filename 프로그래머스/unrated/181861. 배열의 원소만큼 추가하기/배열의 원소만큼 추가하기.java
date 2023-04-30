import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                numbers.add(arr[i]);
            }
        }
        
        int[] answer = numbers.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}