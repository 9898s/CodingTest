class Solution {
    public int[] solution(String s) {
        /*
        1. s 문자열에서 0과 1의 개수를 카운트 해준다.
        2. 0의 개수는 answer[1]에 더해주고, 1의 개수는 2진수 문자열로 변환해준다.
        3. 반복 한 횟수만큼 answer[0]에 더해주면 끝
        */
        
        int[] answer = new int[2];
        while(!s.equals("1")) {
            answer[0]++;
            answer[1] += s.length() - s.replaceAll("0", "").length();
            s = Integer.toBinaryString(s.replaceAll("0", "").length());
        }
        return answer;
    }
}