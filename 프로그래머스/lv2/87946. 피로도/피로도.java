class Solution {
    public boolean[] visited;
    public int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        go(0, k, dungeons);
        
        
        return answer;
    }
    
    public void go(int index, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || k < dungeons[i][0]) {
                continue;
            }

            visited[i] = true;
            go(index + 1, k - dungeons[i][1], dungeons);
            visited[i] = false;
        }
        answer = Math.max(index, answer);
    }
}