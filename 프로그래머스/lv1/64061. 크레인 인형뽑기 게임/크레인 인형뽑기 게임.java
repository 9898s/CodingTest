import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < moves.length; i++) {
            int idx = moves[i] - 1;

            for (int j = 0; j < board.length; j++) {
                if (board[j][idx] != 0) {
                    if (stack.peek() == board[j][idx]) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(board[j][idx]);
                    }
                    board[j][idx] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}