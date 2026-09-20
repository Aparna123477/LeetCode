class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int runningSum=0,left=0,right=0;
        int minDis=Integer.MAX_VALUE;
        while(right<nums.length)
        {
            runningSum+=nums[right];
            while(runningSum>=target){
                runningSum-=nums[left];
                minDis=Math.min(minDis,right-left+1);
                left++;
            }
            right++;
        }
        
    
    return minDis==Integer.MAX_VALUE?0:minDis;
    }
}