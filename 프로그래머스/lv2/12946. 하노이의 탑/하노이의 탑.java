class Solution {
    public int idx = 0;
    
    public int[][] solution(int n) {
        int[][] answer = new int[(int) Math.pow(2, n) - 1][2];
        hanoiTower(answer, n, 1, 2, 3);
        return answer;
    }
    
    public void hanoiTower(int[][] arr, int n, int from, int tmp, int to) {
        if (n == 1) {
            arr[idx][0] = from;
            arr[idx][1] = to;
            idx++;
        } else {
            hanoiTower(arr, n - 1, from, to, tmp);
            arr[idx][0] = from;
            arr[idx][1] = to;
            idx++;
            hanoiTower(arr, n - 1, tmp, from, to);
        }
    }
}