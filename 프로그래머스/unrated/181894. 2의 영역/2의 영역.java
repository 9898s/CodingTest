import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> num = new ArrayList<>();

        int min = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                min = i;
                break;
            }
        }

        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                max = i;
            }
        }

        if(min == -1) {
            num.add(-1);
        } else if(min == max) {
            num.add(2);
        } else {
            for(int i = min; i <= max; i++) {
                num.add(arr[i]);
            }
        }
        
        int[] answer = num.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}