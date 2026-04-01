class Solution {
    public int findKthLargest(int[] nums, int k) {
        //nlogk
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
            if(i>=k) pq.poll();

        }
        return pq.peek();
    }
}