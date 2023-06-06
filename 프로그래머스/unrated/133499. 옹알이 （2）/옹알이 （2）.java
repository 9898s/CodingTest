class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] tell = {"aya", "ye", "woo", "ma"};
        String[] repeatTell = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for (String str : babbling) {
            for (String rStr : repeatTell) {
                str = str.replace(rStr, "0");
            }
            for (String tStr : tell) {
                str = str.replace(tStr, "1");
            }
            
            if (str.replace("1", "").length() == 0) {
                answer++;
            }
        }
        return answer;
    }
}