class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        int k=10000;
        int[] count=new int[2*k+1];
        for(int i=0;i<n;i++)
        {
            count[nums[i]+k]++;
        }
         boolean isEven=true;
            int maxSum=0;
            for(int i=0;i<2*k+1;i++)
            {
                while(count[i]>0)
                {
        
                    maxSum=maxSum+(isEven?i-k:0);
                    count[i]--;
                    isEven=!isEven;
                }
            }
            return maxSum;
    }
}