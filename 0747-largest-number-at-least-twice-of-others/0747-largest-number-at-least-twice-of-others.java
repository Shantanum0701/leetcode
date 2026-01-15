class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isDominant = true;

            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] < 2 * nums[j]) {
                    isDominant = false;
                    break;
                }
            }

            if (isDominant) {
                return i;
            }
        }

        return -1;
    }
}
