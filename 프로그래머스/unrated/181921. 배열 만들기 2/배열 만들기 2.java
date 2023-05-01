import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = l; i <= r; i++) {
            String num = String.valueOf(i);
            for(int j = 0; j < num.length(); j++) {
                if(num.charAt(j) == '0' || num.charAt(j) == '5') {
                    if(num.contains("1") || num.contains("2") || num.contains("3") || num.contains("4") || num.contains("6")|| num.contains("7") || num.contains("8") || num.contains("9")) {
                        continue;
                    }
                    if(!numbers.contains(Integer.parseInt(num))) {
                        numbers.add(Integer.parseInt(num));
                    }
                }
            }
        }

        if(numbers.isEmpty()) {
            numbers.add(-1);
        }

        int[] answer = numbers.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}