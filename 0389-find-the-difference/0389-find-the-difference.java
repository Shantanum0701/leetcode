class Solution {
    public char findTheDifference(String s, String t) {
        
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            
            int countT = 0;
            int countS = 0;
            
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(j) == ch) countT++;
            }
            
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch) countS++;
            }
            
            if (countT != countS) {
                return ch;
            }
        }
        
        return '#'; 
    }
}