class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        // 2단계
        new_id = new_id.replaceAll("[^a-zA-Z0-9-_.]", "");

        // 3단계
        new_id = new_id.replaceAll("\\.{2,}", ".");

        StringBuilder sb = new StringBuilder(new_id);

        // 4단계
        if(sb.length() != 0) {
            if (sb.charAt(0) == '.') {
                sb.delete(0, 1);
            }
        }
        if(sb.length() != 0) {
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.delete(sb.length() - 1, sb.length());
            }
        }

        // 5단계
        if (sb.length() == 0) {
            sb.append("a");
        }

        // 6단계
        if (sb.length() >= 16) {
            sb.delete(15, sb.length());
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.delete(sb.length() - 1, sb.length());
            }
        }
        
        // 7단계
        if (sb.length() <= 2) {
            while (sb.length() < 3) {
                sb.append(sb.charAt(sb.length() - 1));
            }
        }
        return sb.toString();
    }
}