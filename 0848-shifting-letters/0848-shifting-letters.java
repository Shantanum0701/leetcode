class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int len = shifts.length;
        long shifted = 0;

        char[] arr = s.toCharArray();
        for(int i = len-1;i >= 0;i--){
            int ind = s.charAt(i) - 'a';
            shifted = (shifted + shifts[i]) % 26;
            arr[i] = (char) (97+(ind+shifted)%26);
        }

        return new String(arr);
    }
}