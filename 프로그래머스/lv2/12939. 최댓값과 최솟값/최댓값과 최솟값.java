class Solution {
    public String solution(String s) {
        /*     
        1. 공백을 기준으로 나눠서 문자열 배열에 넣어준다.
        2. 정수형 배열을 선언해주고 문자열 배열의 문자를 정수로 변환하고 넣어준다.
        3. 정수형 배열을 오름차순으로 정렬해준다.
        */
        
        String answer = "";
        
        String[] strings = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < strings.length; i++) {
            max = Math.max(max, Integer.parseInt(strings[i]));
            min = Math.min(min, Integer.parseInt(strings[i]));
        }
        
        answer = min + " " + max;
        return answer;
    }
}