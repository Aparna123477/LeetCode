class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max1=maxSubbArray(nums);
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
            nums[i]=-nums[i];
        }
        int minSum=maxSubbArray(nums);
        int max2=total+minSum;
        if(max2==0) return max1;
        return Math.max(max1,max2);
      
    }
    public int maxSubbArray(int[] nums)
    {
        int currSum=nums[0],maxSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum=Math.max(maxSum,currSum);

        }
        return maxSum;
    }
}