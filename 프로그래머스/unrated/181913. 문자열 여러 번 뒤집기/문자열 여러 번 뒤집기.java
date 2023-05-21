class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer sb = new StringBuffer(my_string);
        for (int i = 0; i < queries.length; i++) {
            StringBuffer rep = new StringBuffer(sb.substring(queries[i][0], queries[i][1] + 1)).reverse();
            sb.replace(queries[i][0], queries[i][1] + 1, rep.toString());
        }
        return sb.toString();
    }
}