class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer> freqList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (freqList.contains(count)) {
                return false;
            }

            freqList.add(count);
        }

        return true;
    }
}
