class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub) && sub.length() > maxLen) {
                    ans = sub;
                    maxLen = sub.length();
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l++) != str.charAt(r--)) return false;
        }
        return true;
    }
}
