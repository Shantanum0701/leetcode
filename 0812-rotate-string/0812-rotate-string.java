class Solution {
    public boolean rotateString(String s, String goal) {
        
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;

        StringBuilder str = new StringBuilder(s);
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // rotate by 1
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);

            if (str.toString().equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
