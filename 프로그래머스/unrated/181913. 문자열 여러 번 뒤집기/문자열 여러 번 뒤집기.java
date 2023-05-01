class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer answer = new StringBuffer(my_string);

        for(int i = 0; i < queries.length; i++) {
            StringBuffer text = new StringBuffer();
            text.append(answer.substring(queries[i][0], queries[i][1] + 1)).reverse();
            answer.replace(queries[i][0], queries[i][1] + 1, text.toString());
        }
        return answer.toString();
    }
}