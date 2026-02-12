class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        List<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet()){
            if(map.get(k)>1) {arr.add(k);}
        }
      
        return arr;
    }
}