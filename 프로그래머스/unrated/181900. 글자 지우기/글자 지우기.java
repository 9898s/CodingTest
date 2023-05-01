class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer answer = new StringBuffer();
        for (int i = 0; i < my_string.length(); i++) {
            if (contains(indices, i)) {
                continue;
            }
            answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }

    private static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}