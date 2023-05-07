class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(Integer.toBinaryString(arr1[i] | arr2[i]));
            if(sb.length() < n) {
                sb.insert(0, "0".repeat(n - sb.length()));
            }
            answer[i] = sb.toString().replace("1", "#").replace("0", " ");
        }
        return answer;
    }
}