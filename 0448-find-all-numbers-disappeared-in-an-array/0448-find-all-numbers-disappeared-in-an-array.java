class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean[] arr=new boolean[n];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
           int ind=nums[i]-1;
           arr[ind]=true;
        }
        for(int k=0;k<n;k++){
            if(arr[k]!=true) list.add(k+1);
        }
        return list;

    }
}