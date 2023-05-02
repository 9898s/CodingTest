import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int[] size = new int[30];
        
        for(String str : strArr) {
            size[str.length() - 1]++;
        }
        Arrays.sort(size);

        int answer = size[29];
        return answer;
    }
}