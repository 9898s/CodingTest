class Solution {
    public String solution(String a, String b) {
        String answer = "";
        StringBuffer a2 = new StringBuffer(a);
        StringBuffer b2 = new StringBuffer(b);

        if(a2.length() > b2.length()) {
            b2.insert(0, "0".repeat(a2.length() - b2.length()));
        } else if(a2.length() < b2.length()) {
            a2.insert(0, "0".repeat(b2.length() - a2.length()));
        }

        boolean isUp = false;
        StringBuffer number = new StringBuffer();

        for(int i = 0; i < a2.length(); i++) {
            int num = (a2.charAt(a2.length() - 1 - i) - '0') + (b2.charAt(a2.length() - 1 - i) - '0');
            if(isUp) {
                num++;
                isUp = false;
            }

            if(num < 10) {
                number.append(num);
            } else {
                number.append(num % 10);
                isUp = true;
            }
        }
        if (isUp) {
            number.append("1");
        }
        
        answer = number.reverse().toString();
        return answer;
    }
}