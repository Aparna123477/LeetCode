class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>stack=new Stack<>();
        int[] ans=new int[nums.length];
        int n=nums.length;
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.length*2;i++){

                int idx=i%n;
                while(!stack.isEmpty() && nums[idx]>nums[stack.peek()]){
                    int p=stack.pop();
                    ans[p]=nums[idx];
                }
                stack.push(idx);
            
        }
        return ans;
        
       
    }
}