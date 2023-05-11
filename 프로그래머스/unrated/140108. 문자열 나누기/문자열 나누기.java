class Solution {
    public int solution(String s) {
        int answer = 0;
        char first = s.charAt(0);

        int mainCnt = 1;
        int subCnt = 0;

        for (int i = 1; i < s.length(); i++) {
            if (first == '1') {
                first = s.charAt(i);
                continue;
            }
            if (first == s.charAt(i)) {
                mainCnt++;
            } else {
                subCnt++;

                if (mainCnt == subCnt) {
                    first = '1';
                    mainCnt = 1;
                    subCnt = 0;
                    answer++;
                }
            }
        }

        if (first != '1') {
            answer++;
        }
        return answer;
    }
}