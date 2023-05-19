class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int i = 0; i < queries.length; i++) {
            swap(answer, queries[i][0], queries[i][1]);
        }
        return answer;
    }
    
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}