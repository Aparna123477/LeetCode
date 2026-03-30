class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack=new Stack<>();
        int[] ans=new int[temperatures.length];
        Arrays.fill(ans,0);
        for(int i=0;i<temperatures.length;i++){
            if(stack.isEmpty()) stack.push(i);
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                int ind=stack.pop();
                ans[ind]=i-ind;
                
            }
            stack.push(i);
        }
        return ans;
    }
}