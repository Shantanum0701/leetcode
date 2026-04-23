class Solution {
    public int missingInteger(int[] nums) {
     ArrayList<Integer> list = new ArrayList<>();
     for (int num : nums) {
        list.add(num);
         }
       int sum=nums[0];
       int i;
       int len=nums.length;
       for( i=0;i<len;i++){
             if(i==len-1) break;
             if(nums[i]!=nums[i+1]-1){
                break;
             }
             sum+=nums[i+1];
       }
       while(true){
        if(!list.contains(sum))return sum;
        sum++;
       }
       //return 0;
    }
}