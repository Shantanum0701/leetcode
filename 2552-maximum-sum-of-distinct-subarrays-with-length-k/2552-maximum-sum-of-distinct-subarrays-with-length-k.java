class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long windowSum = 0;
        Set<Integer> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // if duplicate appears, shrink window from left
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // add current element
            set.add(nums[right]);
            windowSum += nums[right];

            // if window size > k, shrink
            if (right - left + 1 > k) {
                set.remove(nums[left]);
                windowSum -= nums[left];
                left++;
            }

            // if valid window of size k and distinct
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }
}
