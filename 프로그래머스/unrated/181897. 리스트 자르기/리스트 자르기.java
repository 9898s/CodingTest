import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        switch (n) {
            case 1:
                for (int i = 0; i <= slicer[1]; i++) {
                    arr.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = slicer[0]; i < num_list.length; i++) {
                    arr.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = slicer[0]; i <= slicer[1]; i++) {
                    arr.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    arr.add(num_list[i]);
                }
                break;
        }
        
        int[] answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}