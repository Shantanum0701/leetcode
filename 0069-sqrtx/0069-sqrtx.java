class Solution {
    public int mySqrt(int x) {
        int count = 0;
        for(int i=1; i<=x/i; i++){
            count++;
        }
        return count;
    }
}