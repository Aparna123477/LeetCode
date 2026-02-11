class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int k=1;k<=nums.length+1;k++){
            if(!set.contains(k)) return k;
        }
        return -1;
        
    }
}