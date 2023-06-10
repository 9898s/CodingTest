class Solution {
    public String solution(String s) {
        /*
        1. s 문자열을 소문자로 변환해준다.
        2. 논리형 변수 isSpace를 선언해준다. (첫 글자는 무조건 대문자이므로 true로 초기화 해준다.)
        3. 반복문을 돌려서 문자 하나하나씩 확인해준다.
        4. 공백 부분이 나타나면 isSpace 변수에 true 값을 넣어준다.
        5. isSpace 변수가 true일 경우 다음 문자를 대문자로 변환 해주고 isSpace는 false로 바꿔준다.
        */
        
        String answer = "";
        
        s = s.toLowerCase();
        boolean isSpace = true;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                isSpace = true;
            }
            else {
                if (isSpace) {
                    isSpace = false;
                    ch = Character.toUpperCase(ch);
                }
            }
            answer += ch;
        }
        return answer;
    }
}