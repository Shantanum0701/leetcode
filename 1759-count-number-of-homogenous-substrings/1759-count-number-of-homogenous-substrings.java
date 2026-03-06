class Solution {
    public int countHomogenous(String s) {

        long ans = 0;
        long streak = 0;
        int MOD = 1000000007;

        for (int i = 0; i < s.length(); i++) {

            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                streak++;
            } else {
                streak = 1;
            }

            ans += streak;
            ans %= MOD;
        }

        return (int) ans;
    }
}