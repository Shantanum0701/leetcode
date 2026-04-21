import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // important

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int rem = (k == 0) ? sum : sum % k;

            if (map.containsKey(rem)) {
                int prevIndex = map.get(rem);

                if (i - prevIndex >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }
}

// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {

//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//             int sum = nums[i];

//             for (int j = i + 1; j < n; j++) {
//                 sum += nums[j];

//                 if (sum % k == 0) {
//                     return true;
//                 }
//             }
//         }

//         return false;
//     }
// }

