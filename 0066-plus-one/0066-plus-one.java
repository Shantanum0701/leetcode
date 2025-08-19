class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add 1 if no carry needed
                return digits;
            }
            digits[i] = 0;  // if digit was 9, set to 0 and carry continues
        }
        
        // If we are here, it means all digits were 9 (e.g., 999 -> 1000)
        int[] res = new int[digits.length + 1];
        res[0] = 1;  // first digit will be 1, rest will be 0 by default
        return res;
    }
}
