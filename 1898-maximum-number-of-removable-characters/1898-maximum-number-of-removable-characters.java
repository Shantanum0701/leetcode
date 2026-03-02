class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int left = 0, right = removable.length;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isSubsequenceAfterRemoval(s, p, removable, mid)) {
                ans = mid;          // mid is possible
                left = mid + 1;     // try more removals
            } else {
                right = mid - 1;    // too many removals
            }
        }
        return ans;
    }

    private boolean isSubsequenceAfterRemoval(
            String s, String p, int[] removable, int k) {

        boolean[] removed = new boolean[s.length()];
        for (int i = 0; i < k; i++) {
            removed[removable[i]] = true;
        }

        int j = 0;
        for (int i = 0; i < s.length() && j < p.length(); i++) {
            if (removed[i]) continue;
            if (s.charAt(i) == p.charAt(j)) {
                j++;
            }
        }
        return j == p.length();
    }
}