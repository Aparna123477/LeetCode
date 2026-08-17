public class Solution {
    public int MaximumDifference(int[] nums) {
        int minnum=int.MaxValue;
        int mxdiff=-1;
        foreach(int num in nums){
            if(num<=minnum) minnum=num;
            else mxdiff=Math.Max(mxdiff,num-minnum);
        }
        return mxdiff;
        
    }
}