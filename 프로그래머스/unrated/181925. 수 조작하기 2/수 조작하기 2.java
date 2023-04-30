class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < numLog.length - 1; i++) {
            if(numLog[i] - numLog[i + 1] == 1) {
                answer.append("s");
            } else if(numLog[i] - numLog[i + 1] == -1) {
                answer.append("w");
            } else if(numLog[i] - numLog[i + 1] == 10) {
                answer.append("a");
            } else if(numLog[i] - numLog[i + 1] == -10) {
                answer.append("d");
            }
        }
        return answer.toString();
    }
}