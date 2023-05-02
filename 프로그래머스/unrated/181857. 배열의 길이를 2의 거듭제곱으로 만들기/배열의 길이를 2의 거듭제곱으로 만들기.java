class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        while ((int) Math.pow(2, count) < arr.length) {
            count++;
        }
        
        int size = (int) Math.pow(2, count);
        int[] answer = new int[size];
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}