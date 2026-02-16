class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int h: heights){
            count[h]++;
        }

        int missMatch = 0;
        int index = 0;
        for (int height = 1; height < 101; height++){
            while (count[height] > 0){
                if (heights[index] != height){
                    missMatch++;
                }
                index++;
                count[height]--;
            }
        }
        return missMatch;
    }
}