class Solution {
    public int rob(int[] nums) {
       int[] dp=new int[nums.length];
       Arrays.fill(dp,-1);
        return fun(nums,0,dp);
        
    }
    int fun(int[] nums,int ind,int[] dp){
        if(ind>=nums.length)return 0;
        if(dp[ind]!=-1)return dp[ind];
        int ai=nums[ind]+fun(nums,ind+2,dp);
        int a2=fun(nums,ind+1,dp);
        return dp[ind]=Math.max(ai,a2);


    }
}