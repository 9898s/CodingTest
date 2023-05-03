class Solution {
    public int[][] solution(int[][] arr) {
        int size = 0;
        if(arr.length > arr[0].length) { // 행 > 열
            size = arr.length;
        } else {
            size = arr[0].length;
        }

        int[][] answer = new int[size][size];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}