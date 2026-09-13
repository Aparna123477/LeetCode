class Solution {
    public int[] replaceElements(int[] arr) {
        int m=-1;
        int n=arr.length;
        int[] nums=new int[n];
        nums[n-1]=m;
        for(int i=n-1;i>0;i--){
            m=Math.max(m,arr[i]);
            nums[i-1]=m;
        }
        return nums;
    }
}