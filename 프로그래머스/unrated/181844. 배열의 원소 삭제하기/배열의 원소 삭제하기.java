import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            boolean isDelete = false;
            
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    isDelete = true;
                }
            }

            if(!isDelete) {
                numbers.add(arr[i]);
            }
        }
        
        int[] answer = numbers.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}