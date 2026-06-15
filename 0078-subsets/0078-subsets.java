class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        func(nums,ans,new ArrayList<>(),0);
        return ans;
    }
    void func(int[] arr,List<List<Integer>>ans,List<Integer> curr,int idx){
        if(idx==arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[idx]);
        func(arr,ans,curr,idx+1);
        curr.remove(curr.size()-1);
        func(arr,ans,curr,idx+1);
        
    }
}