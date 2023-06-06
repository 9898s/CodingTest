class Solution {
    public String solution(String X, String Y) {
        int[] X1 = new int[10];
        int[] Y1 = new int[10];

        for (char ch : X.toCharArray()) {
            X1[ch - '0']++;
        }

        for (char ch : Y.toCharArray()) {
            Y1[ch - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            if (X1[i] > 0 && Y1[i] > 0) {
                sb.append(String.valueOf(i).repeat(Math.min(X1[i], Y1[i])));
            }
        }
        
        if (sb.length() == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}