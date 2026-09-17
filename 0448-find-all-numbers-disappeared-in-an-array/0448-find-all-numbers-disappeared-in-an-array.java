class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean[] freq=new boolean[n+1];
        for(int num:nums) freq[num]=true;

        List<Integer>miss=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!freq[i])miss.add(i);
        }
        return miss;
    }

}