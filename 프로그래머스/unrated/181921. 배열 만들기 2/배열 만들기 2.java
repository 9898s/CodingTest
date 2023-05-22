import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String number = String.valueOf(i);

            if (number.contains("1") || number.contains("2") || number.contains("3") || number.contains("4") || number.contains("6") || number.contains("7") || number.contains("8") || number.contains("9")) {
                continue;
            }
            list.add(Integer.parseInt(number));
        }

        if (list.isEmpty()) {
            list.add(-1);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}