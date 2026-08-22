class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        Set<Integer>set2=new HashSet<>();
        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            set2.add(n);
        }
        int[] ans=new int[set1.size()];
        int k=0;
        for(int n:set1){
            if(set2.contains(n)){
                    ans[k]=n;
                    k=k+1;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}