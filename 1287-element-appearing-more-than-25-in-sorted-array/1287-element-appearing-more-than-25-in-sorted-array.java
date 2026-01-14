import java.util.*;

class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            if (freq.get(num) > n / 4) {
                return num;
            }
        }

        return -1;
    }
}
