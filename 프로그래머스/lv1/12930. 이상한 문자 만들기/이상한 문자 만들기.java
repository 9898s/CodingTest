class Solution {
    public String solution(String s) {
        StringBuffer sb = new StringBuffer();
        int idx = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                sb.append(s.charAt(i));
                idx = 0;
            } else {
                if(idx % 2 == 0) {
                    sb.append(s.toUpperCase().charAt(i));
                } else {
                    sb.append(s.toLowerCase().charAt(i));
                }
                idx++;
            }
        }
        return sb.toString();
    }
}