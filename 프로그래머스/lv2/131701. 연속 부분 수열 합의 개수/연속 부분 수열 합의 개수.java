import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int[] newElements = new int[elements.length * 2];
        for (int i = 0; i < newElements.length; i++) {
            newElements[i] = elements[i % elements.length];
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < elements.length; i++) {
            int sum = 0;
            for (int j = i; j < i + elements.length; j++) {
                sum += newElements[j];
                hashSet.add(sum);
            }
        }
        return hashSet.size();
    }
}