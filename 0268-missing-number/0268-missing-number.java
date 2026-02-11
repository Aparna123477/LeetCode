class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean[] pos=new boolean[n+1];
        for(int i: nums){
            pos[i]=true;
        }
        for(int k=0;k<pos.length;k++){
            if(pos[k]==false) return k;
        }
        return -1;
    }
}