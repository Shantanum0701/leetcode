class Solution {
    public int maxFrequency(int[] nums, int k) {
        if(nums.length==1) return 1;        
        int maxCommon = 1;
        int j = 0;
        long sum =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            while((long)nums[i]*(i-j+1)-sum>k){
                sum-=nums[j];
                j++;
            }
            maxCommon = Math.max(maxCommon, i-j+1);
        }
        return maxCommon;
    }
}