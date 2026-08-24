class Solution {
    public int findNumbers(int[] nums) {
        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            if(s.length()%2==0) e++;
            else o++;
        }
        return e;
    }
}