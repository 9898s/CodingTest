class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (String s : control.split("")) {
            if(s.equals("w")) {
                answer += 1;
            } else if(s.equals("s")) {
                answer -= 1;
            } else if(s.equals("d")) {
                answer += 10;
            } else if(s.equals("a")) {
                answer -= 10;
            }
        }
        return answer;
    }
}