class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int sum = nums[0];

        runningSum[0] = nums[0];
        for(int i=0;i<nums.length-1;i++){
            sum = sum+nums[i+1];
            runningSum[i+1] = sum;
        }
        return runningSum;
    }
}