class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0;
        int n=nums.length;
        while(p+1<n && nums[p]<nums[p+1]){
            p++;
        }
        if(p==0 || p==n-1) return false;

        int q=p;
        while(q+1<n && nums[q]>nums[q+1]){
            q++;
        }
        if(q==n-1 || q==p) return false;

        for(int i=q;i<n-1;i++){
            if(nums[i]>=nums[i+1]){
                return false;
            }
        }
        return true;
    }
}