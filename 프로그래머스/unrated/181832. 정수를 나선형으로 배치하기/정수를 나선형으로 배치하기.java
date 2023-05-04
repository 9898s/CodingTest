class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        int xStart = 0;
        int xEnd = n - 1;

        int yStart = 0;
        int yEnd = n - 1;

        int num = 1;
        while (xStart <= xEnd && yStart <= yStart) {
            for (int i = xStart; i <= xEnd; i++) {
                answer[yStart][i] = num;
                num++;
            }
            yStart++;

            for (int i = yStart; i <= yEnd; i++) {
                answer[i][xEnd] = num;
                num++;
            }
            xEnd--;

            for (int i = xEnd; i >= xStart; i--) {
                answer[yEnd][i] = num;
                num++;
            }
            yEnd--;

            for (int i = yEnd; i >= yStart; i--) {
                answer[i][xStart] = num;
                num++;
            }
            xStart++;
        }
        return answer;
    }
}