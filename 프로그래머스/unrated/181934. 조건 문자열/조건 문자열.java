class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        sb.append(ineq).append(eq);
        
        if(sb.toString().equals(">=")) {
            if(n >= m) {
                answer = 1;
            }
        } else if(sb.toString().equals("<=")) {
            if(n <= m) {
                answer = 1;
            }
        } else if(sb.toString().equals(">!")) {
            if(n > m) {
                answer = 1;
            }
        } else if(sb.toString().equals("<!")) {
            if(n < m) {
                answer = 1;
            }
        }
        return answer;
    }
}