class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        answer[0] = Integer.MAX_VALUE;
        answer[1] = Integer.MAX_VALUE;
        
        answer[2] = Integer.MIN_VALUE;
        answer[3] = Integer.MIN_VALUE;
        
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                answer[0] = Math.min(i, answer[0]);
                answer[1] = Math.min(wallpaper[i].indexOf("#"), answer[1]);
                
                answer[2] = Math.max(i + 1, answer[2]);
                answer[3] = Math.max(wallpaper[i].lastIndexOf("#") + 1, answer[3]);
            }
        }
        return answer;
    }
}