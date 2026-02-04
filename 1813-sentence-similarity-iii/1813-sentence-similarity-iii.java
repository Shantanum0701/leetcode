class Solution {
    public boolean areSentencesSimilar(String s1, String s2) {

        String[] a = s1.split(" ");
        String[] b = s2.split(" ");

        int i = 0;

        // Match from start
        while (i < a.length && i < b.length && a[i].equals(b[i])) {
            i++;
        }

        int j = 0;

        // Match from end
        while (j < a.length - i && j < b.length - i &&
               a[a.length - 1 - j].equals(b[b.length - 1 - j])) {
            j++;
        }

        return i + j >= Math.min(a.length, b.length);
    }
}
