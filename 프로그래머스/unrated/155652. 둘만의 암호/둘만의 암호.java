class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] chars = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char ch = s.charAt(i);

            while (count < index) {
                ch++;
                if (ch > 'z') {
                    ch = 'a';
                }
                if (!skip.contains(String.valueOf(ch))) {
                    count++;
                }
            }
            answer += ch;
        }
        return answer;
    }
}