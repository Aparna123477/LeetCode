class Solution {
    public int longestSubarray(int[] nums) {
        int count=0;
       
        for(int i=0;i<nums.length;i++){
            int zero=0;
            int j=i;
            for( j=i;j<nums.length;j++){
                if(nums[j]==0) zero++;
                 if(zero>1) break;
                
            }
            int size=j-i-1;
           count=Math.max(count,size);
        }
        return count;
    }
}