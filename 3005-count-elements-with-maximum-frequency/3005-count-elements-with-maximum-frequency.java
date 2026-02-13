class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int i:map.values()){
            max=Math.max(max,i);
        }
        int total=0;
        for(int i:map.values()){
            if(i==max) total+=i;
        }
        return total;
    }
}