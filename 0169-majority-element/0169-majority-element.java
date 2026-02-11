class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)>(n/2)) return k;
        }
        return -1;
    }
}