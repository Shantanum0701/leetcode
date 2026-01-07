class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target)
                return true;
                if (nums[low]==nums[mid] && nums[mid]== nums[high]){
                    low=low+1;
                    high=high-1;
                    continue;
                }

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;  // target is in the left half
                } else {
                    low = mid + 1;   // target is in the right half
                }
            } 
            // Otherwise, right half must be sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;  // target is in the right half
                } else {
                    high = mid - 1; // target is in the left half
                }
            }
        }

        return false;
    }
}
        