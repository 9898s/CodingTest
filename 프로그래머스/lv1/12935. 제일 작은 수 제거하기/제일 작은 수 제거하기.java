class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length == 1 ? arr.length : arr.length - 1;
        int[] answer = new int[size];
        
        if(size == 1) {
            answer[0] = -1;
        } else {
            int min = arr[0];
            
            for(int i = 1; i < arr.length; i++) {
                if(min > arr[i]) {
                    min = arr[i];
                }
            }
            
            int idx = 0;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] != min) {
                    answer[idx++] = arr[i];
                }
            }
        }
        return answer;
    }
}