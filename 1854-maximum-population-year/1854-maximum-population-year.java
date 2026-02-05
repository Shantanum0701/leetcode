class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxPop = 0;
        int maxYear = 1950;

        for (int year = 1950; year <= 2050; year++) {
            int count = 0;

            for (int[] log : logs) {
                if (log[0] <= year && year < log[1]) {
                    count++;
                }
            }

            if (count > maxPop) {
                maxPop = count;
                maxYear = year;
            }
        }

        return maxYear;
    }
}
