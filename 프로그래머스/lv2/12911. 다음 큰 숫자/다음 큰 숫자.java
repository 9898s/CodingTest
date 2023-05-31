class Solution {
    public int solution(int n) {
        int zeroCnt = 0;
        String binaryN = Integer.toBinaryString(n);

        for (char ch : binaryN.toCharArray()) {
            if (ch == '1') {
                zeroCnt++;
            }
        }

        int answer = n;
        while (true) {
            answer++;

            int tmpCnt = 0;
            String tmp = Integer.toBinaryString(answer);
            for (char ch : tmp.toCharArray()) {
                if (ch == '1') {
                    tmpCnt++;
                }
            }
            if (tmpCnt == zeroCnt) {
                break;
            }
        }
        return answer;
    }
}