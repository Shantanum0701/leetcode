import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        // Step 1: compute sum of longest sequential prefix
        int prefixSum = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                prefixSum += nums[i];
            } else {
                break;
            }
        }

        // Step 2: find smallest missing integer >= prefixSum
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int x = prefixSum;
        while (set.contains(x)) {
            x++;
        }

        return x;
    }
}