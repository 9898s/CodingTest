class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] text = binomial.split(" ");
        if(text[1].equals("+")) {
            answer = Integer.parseInt(text[0]) + Integer.parseInt(text[2]);
        } else if(text[1].equals("-")) {
            answer = Integer.parseInt(text[0]) - Integer.parseInt(text[2]);
        } else if(text[1].equals("*")) {
            answer = Integer.parseInt(text[0]) * Integer.parseInt(text[2]);
        }
        return answer;
    }
}