class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int zeros=0;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeros++;
            while(zeros>k) {
                if(nums[s]==0){
                    zeros--;
                }
                s++;
            }
            max=Math.max(max,i-s+1);
        }
        return max;
    }
}