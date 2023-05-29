class Solution {
    public int[] solution(String s) {
        int step = 0;
        int count = 0;
        String binaryString = s;

        while (!binaryString.equals("1")) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '0') {
                    count++;
                } else {
                    sb.append(binaryString.charAt(i));
                }
            }
            binaryString = Integer.toString(sb.length(), 2);
            step++;
        }

        int[] answer = {step, count};
        return answer;
    }
}