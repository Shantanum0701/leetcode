class Solution {
    public int compress(char[] chars) {
        int write = 0;  // position to write compressed chars
        int read = 0;   // position to read original chars
        
        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count consecutive characters
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If count > 1, write its digits
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write; // new length
    }
}
