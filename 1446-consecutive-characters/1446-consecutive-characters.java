class Solution {
    public int maxPower(String s) {
        int n = s.length();
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                } else {
                    break;
                }
            }

            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
}
