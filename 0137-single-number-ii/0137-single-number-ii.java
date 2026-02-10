class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            int c=map.getOrDefault(i,0);
            map.put(i,c+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)==1) return k;
        }
        return -1;
    }
}