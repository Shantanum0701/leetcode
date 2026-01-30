class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0;
        int n= nums.length;
        int[] result = new int[n];

        for(int i=0;i<=n-1;i++){
            for(int j=n-1; j>=0;j--){
                if(nums[i] > nums[j] && nums[i] != nums[j]){
                    count++;
                } 
                
            }
            result[i] = count; 
            count=0;
        }
        return result;
        
    }
}