import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        // 50 50 70 80
        
        int answer = 0;
        Arrays.sort(people);
        
        int x = 0;
        int y = people.length - 1;
        
        while (x <= y) {
            if (people[x] + people[y] <= limit) {
                x++;
                y--;
            } else {
                y--;
            }
            answer++;
        }
        return answer;
    }
}