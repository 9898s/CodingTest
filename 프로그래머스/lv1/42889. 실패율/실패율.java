class Solution {
    public int[] solution(int N, int[] stages) {
        int stage = stages.length;
        double[][] arr = new double[N][2];

        for (int i = 0; i < N; i++) {
            int cnt = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i + 1 == stages[j]) {
                    cnt++;
                }
            }
            arr[i][0] = i + 1.0;
            arr[i][1] = (double) cnt / stage;
            stage -= cnt;
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i][1] < arr[j][1]) {
                    double[] tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                } else if (arr[i][1] == arr[j][1]) {
                    if (arr[i][0] > arr[j][0]) {
                        double[] tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
        }

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) arr[i][0];
        }
        return answer;
    }
}