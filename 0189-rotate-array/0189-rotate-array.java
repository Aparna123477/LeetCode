class Solution {
    public void rev(int[] nums,int start,int end)
    {
        while(start<=end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
        
        start=start+1;
        end=end-1;
    }
    }
    public void rotate(int[] nums, int k) {
        //  1 2 3 4 7 6 5 k-> rev
        // 5 6 7 4 3 2 1  nums-> rev
        // 5 6 7 1 2 3 4   n-k->rev
        int n=nums.length;
        if(k%n==0) return ;
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1); 
        
        
    }
}