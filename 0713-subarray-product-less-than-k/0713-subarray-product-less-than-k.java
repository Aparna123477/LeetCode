class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return 0;
        int count=0;
       int pr=1;
       int l=0;
        for(int i=0;i<nums.length;i++){
         pr*=nums[i];
         count+=(i-l);
         
         while(pr>=k){
            pr=pr/nums[l];
            count+=(i-l+1);
            l++;
         }
         
         
        }
        return count;
    }
   
}