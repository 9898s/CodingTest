class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for (int i = 0; i < arr1.length; i++) {
            String binaryNumber = Integer.toString(arr1[i] | arr2[i], 2);
            if (binaryNumber.length() < n) {
                binaryNumber = "0".repeat(n - binaryNumber.length()) + binaryNumber;
            }
            answer[i] = binaryNumber.replaceAll("0", " ").replaceAll("1", "#");
        }
        return answer;
    }
}