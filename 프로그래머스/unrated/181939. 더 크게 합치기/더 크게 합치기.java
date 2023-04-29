class Solution {
    public int solution(int a, int b) {
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        
        x.append(a).append(b);
        y.append(b).append(a);

        int answer = Integer.parseInt(x.toString()) > Integer.parseInt(y.toString()) ? Integer.parseInt(x.toString()) : Integer.parseInt(y.toString());
        return answer;
    }
}