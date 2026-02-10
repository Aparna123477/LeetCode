class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
       List<Integer>arr=new ArrayList<>();
      
        for(int n:nums){
            int c=map.getOrDefault(n,0);
            map.put(n,c+1);
        }
        for(int c:map.keySet()){
            if(map.get(c)==1){
                arr.add(c);
            }
        }
        int[] num=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            num[i]=arr.get(i);
        }
        return num;
    }
}