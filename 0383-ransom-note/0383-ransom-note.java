class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        StringBuilder mag = new StringBuilder(magazine);

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            int index = mag.indexOf(String.valueOf(c));
            if (index == -1) {
                return false; // character not found
            }

            // remove used character
            mag.deleteCharAt(index);
        }

        return true;
    }
}
