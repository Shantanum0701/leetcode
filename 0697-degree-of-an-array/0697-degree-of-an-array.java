import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        int n = nums.length;

        // Step 1: Fill maps
        for (int i = 0; i < n; i++) {
            int num = nums[i];

            freq.put(num, freq.getOrDefault(num, 0) + 1);

            if (!first.containsKey(num)) {
                first.put(num, i);
            }

            last.put(num, i);
        }

        // Step 2: Find degree
        int degree = 0;
        for (int f : freq.values()) {
            degree = Math.max(degree, f);
        }

        // Step 3: Find minimum length
        int minLength = n;

        for (int num : freq.keySet()) {
            if (freq.get(num) == degree) {
                int length = last.get(num) - first.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }

        return minLength;
    }
}