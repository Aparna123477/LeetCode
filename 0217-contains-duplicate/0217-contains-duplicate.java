class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int p:nums){
            if(set.contains(p)) return true;
        
        set.add(p);}
        return false;
    }
}