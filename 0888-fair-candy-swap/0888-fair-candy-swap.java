class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0, sumB = 0;

        for (int a : aliceSizes) sumA += a;
        for (int b : bobSizes) sumB += b;

        for (int x : aliceSizes) {
            for (int y : bobSizes) {

                if (sumA - x + y == sumB - y + x) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[0];
    }
}
