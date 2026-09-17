class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;;
        int max_ind=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                max_ind=i;
            }
           
        }
        for(int i=0;i<nums.length;i++)
        {if(i==max_ind)continue;
          if(max<2*nums[i]) return -1;

        }
        return max_ind;
        
    }
}