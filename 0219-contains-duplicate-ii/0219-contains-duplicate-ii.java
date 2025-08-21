import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int pastIndex = hm.get(nums[i]);
                if (i - pastIndex <= k) {
                    return true;
                }
            }
            hm.put(nums[i], i); // update index (important!)
        }
        
        return false;
    }
}
