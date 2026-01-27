class Solution {
    public boolean halvesAreAlike(String s) {
        int count = 0;
        int n = s.length();
        int mid = n / 2;

        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                
                if (i < mid) {
                    count++;   
                } else {
                    count--;   
                }
            }
        }

        return count == 0;
    }
}
