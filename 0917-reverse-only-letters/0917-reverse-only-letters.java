class Solution {
    public String reverseOnlyLetters(String s) {

        // Step 1: collect all letters
        StringBuilder letters = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                letters.append(c);
            }
        }

        // Step 2: reverse the letters
        letters.reverse();

        // Step 3: rebuild the string
        StringBuilder result = new StringBuilder();
        int index = 0;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(letters.charAt(index++));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
