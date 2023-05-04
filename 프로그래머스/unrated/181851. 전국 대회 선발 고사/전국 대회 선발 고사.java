class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int size = 0;
        for (boolean b : attendance) {
            if (b) {
                size++;
            }
        }

        int idx = 0;
        int[][] arr = new int[size][2];
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                arr[idx][0] = rank[i];
                arr[idx][1] = i;
                idx++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i][0] > arr[j][0]) {
                    int[] tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        int answer = 10000 * arr[0][1] + 100 * arr[1][1] + arr[2][1];
        return answer;
    }
}