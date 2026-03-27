class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        HashSet<String> morsetrans = new HashSet<>();
        for (String word : words) {
            StringBuilder trans = new StringBuilder();
            for (char c : word.toCharArray()) {
                trans.append(morse[c - 'a']);
            }
            morsetrans.add(trans.toString());
        }
        return morsetrans.size();
    }
}