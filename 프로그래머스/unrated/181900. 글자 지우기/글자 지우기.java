class Solution {
    public String solution(String my_string, int[] indices) {
        char[] chs = my_string.toCharArray();

        for(int i : indices) {
            chs[i] = '1';
        }

        StringBuffer answer = new StringBuffer();
        for(int i = 0; i < chs.length; i++) {
            if(chs[i] != '1') {
                answer.append(chs[i]);
            }
        }
        return answer.toString();
    }
}