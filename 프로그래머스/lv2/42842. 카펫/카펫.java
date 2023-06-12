class Solution {
    public int[] solution(int brown, int yellow) {
        /*
        1. yellow의 약수를 구해준다.
        2. 약수의 값 중에서 큰 값을 가로, 작은 값을 세로로 지정한다.
        3. (가로 + 2) * 2 + 세로 * 2의 값이 brown인 것을 찾아준다.
        4. 찾은 후 전체 카펫의 가로, 세로 길이를 구해준다.
        */
        
        int[] answer = new int[2];
        
        for (int i = 1; i * i <= yellow; i++) {
            if (yellow % i == 0) {
                int row = yellow / i;
                int col = i;
                
                if ((row + 2) * 2 + col * 2 == brown) {
                    answer[0] = row + 2;
                    answer[1] = col + 2;
                    break;
                }
            }
        }
        return answer;
    }
}