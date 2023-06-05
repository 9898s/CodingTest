class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < 2; j++) {
                int tmp1 = Math.max(sizes[i][0], sizes[i][1]);
                int tmp2 = Math.min(sizes[i][0], sizes[i][1]);
                
                x = Math.max(x, tmp1);
                y = Math.max(y, tmp2);
            }
        }
        
        answer = x * y;
        return answer;
    }
}