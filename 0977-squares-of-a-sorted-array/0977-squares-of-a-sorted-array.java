class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n=nums[i]*nums[i];
            ans[i]=n;
          
        }
       Arrays.sort(ans);
       return ans;
    }
}