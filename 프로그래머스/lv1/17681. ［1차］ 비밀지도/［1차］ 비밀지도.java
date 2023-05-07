class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuffer sb1 = new StringBuffer(Integer.toString(arr1[i], 2));
            if(sb1.length() < n) {
                sb1.insert(0, "0".repeat(n - sb1.length()));
            }

            StringBuffer sb2 = new StringBuffer(Integer.toString(arr2[i], 2));
            if(sb2.length() < n) {
                sb2.insert(0, "0".repeat(n - sb2.length()));
            }

            StringBuffer sb3 = new StringBuffer();
            for (int j = 0; j < n; j++) {
                if(sb1.charAt(j) == '1' || sb2.charAt(j) == '1') {
                    sb3.append("#");
                } else {
                    sb3.append(' ');
                }
            }
            answer[i] = sb3.toString();
        }
        return answer;
    }
}